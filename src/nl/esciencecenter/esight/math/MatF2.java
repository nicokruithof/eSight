package nl.esciencecenter.esight.math;

import java.util.Arrays;

/* Copyright [2013] [Netherlands eScience Center]
 * 
 * Licensed under the Apache License, Version 2.0 (the "License")
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * 2x2 float matrix implementation.
 * 
 * @author Maarten van Meersbergen <m.van.meersbergen@esciencecenter.nl>
 * 
 */
public class MatF2 extends MatrixF {
    /** The number of elements in this matrix */
    private static final int SIZE = 4;

    /**
     * Creates a new identity matrix.
     */
    public MatF2() {
        super(SIZE);
        identity();
    }

    /**
     * Helper method to create a new identity matrix.
     */
    private void identity() {
        Arrays.fill(asArray(), 0f);
        asArray()[0] = 1.0f;
        asArray()[3] = 1.0f;
    }

    /**
     * Creates a new matrix with all slots filled with the parameter.
     * 
     * @param in
     *            The value to be put in all matrix fields.
     */
    public MatF2(float in) {
        super(SIZE);
        Arrays.fill(asArray(), in);
    }

    /**
     * Creates a new matrix, using the vectors in order as filling.
     * 
     * @param v0
     *            The first row of the matrix.
     * @param v1
     *            The second row of the matrix.
     */
    public MatF2(VecF2 v0, VecF2 v1) {
        super(SIZE);
        asArray()[0] = v0.getX();
        asArray()[1] = v0.getY();

        asArray()[2] = v1.getX();
        asArray()[3] = v1.getY();
    }

    /**
     * Creates a new matrix using the parameters row-wise as filling.
     * 
     * @param m00
     *            The parameter on position 0x0.
     * @param m01
     *            The parameter on position 0x1.
     * @param m10
     *            The parameter on position 1x0.
     * @param m11
     *            The parameter on position 1x1.
     */
    public MatF2(float m00, float m01, float m10, float m11) {
        super(SIZE);
        asArray()[0] = m00;
        asArray()[1] = m01;
        asArray()[2] = m10;
        asArray()[3] = m11;
    }

    /**
     * Creates a new matrix by copying the matrix used as parameter.
     * 
     * @param n
     *            The old matrix to be copied.
     */
    public MatF2(MatF2 n) {
        super(SIZE);

        for (int i = 0; i < SIZE; i++) {
            asArray()[i] = n.get(i);
        }
    }

    /**
     * Multiplies this matrix with the given matrix, returning a new matrix.
     * 
     * @param n
     *            The matrix to be multiplied with the current matrix.
     * @return The new matrix that is the result of the multiplication.
     */
    public MatF2 mul(MatF2 n) {
        MatF2 a = new MatF2(0f);

        a.asArray()[0] = asArray()[0] * n.asArray()[0] + asArray()[1] * n.asArray()[2];
        a.asArray()[1] = asArray()[0] * n.asArray()[1] + asArray()[1] * n.asArray()[3];
        a.asArray()[2] = asArray()[2] * n.asArray()[0] + asArray()[3] * n.asArray()[2];
        a.asArray()[3] = asArray()[2] * n.asArray()[1] + asArray()[3] * n.asArray()[3];

        return a;
    }

    /**
     * Adds this matrix to the given matrix, returning a new matrix.
     * 
     * @param n
     *            The matrix to be added to the current matrix.
     * @return The new matrix that is the result of the addition.
     */
    public MatF2 add(MatF2 n) {
        MatF2 result = new MatF2(0f);

        for (int i = 0; i < SIZE; ++i) {
            result.asArray()[i] = asArray()[i] + n.asArray()[i];
        }

        return result;
    }

    /**
     * Substracts this matrix with the given matrix, returning a new matrix.
     * 
     * @param n
     *            The matrix to be substracted from to the current matrix.
     * @return The new matrix that is the result of the substraction.
     */
    public MatF2 sub(MatF2 n) {
        MatF2 result = new MatF2(0f);

        for (int i = 0; i < SIZE; ++i) {
            result.asArray()[i] = asArray()[i] - n.asArray()[i];
        }

        return result;
    }

    /**
     * Multiplies this matrix with the given scalar, returning a new matrix.
     * 
     * @param n
     *            The scalar to be multiplied with the current matrix.
     * @return The new matrix that is the result of the multiplication.
     */
    public MatF2 mul(Number n) {
        MatF2 result = new MatF2(0f);

        float fn = n.floatValue();
        for (int i = 0; i < SIZE; ++i) {
            result.asArray()[i] = asArray()[i] * fn;
        }

        return result;
    }

    /**
     * Multiplies this matrix with the given scalar, returning a new matrix.
     * 
     * @param n
     *            The scalar to be multiplied with the current matrix.
     * @return The new matrix that is the result of the multiplication.
     */
    public MatF2 add(Number n) {
        MatF2 result = new MatF2();

        float fn = n.floatValue();
        for (int i = 0; i < SIZE; ++i) {
            result.asArray()[i] = asArray()[i] + fn;
        }

        return result;
    }

    /**
     * Multiplies this matrix with the given scalar, returning a new matrix.
     * 
     * @param n
     *            The scalar to be multiplied with the current matrix.
     * @return The new matrix that is the result of the multiplication.
     */
    public MatF2 sub(Number n) {
        MatF2 result = new MatF2(0f);

        float fn = n.floatValue();
        for (int i = 0; i < SIZE; ++i) {
            result.asArray()[i] = asArray()[i] - fn;
        }

        return result;
    }

    /**
     * Divides the elements of this matrix with the given scalar, returning a
     * new matrix.
     * 
     * @param n
     *            The scalar with which to divide the values of the current
     *            matrix.
     * @return The new matrix that is the result of the division.
     */
    public MatF2 div(Number n) {
        MatF2 result = new MatF2(0f);

        float fn = 1f / n.floatValue();

        for (int i = 0; i < SIZE; ++i) {
            result.asArray()[i] = asArray()[i] * fn;
        }

        return result;
    }

    /**
     * Multiplies this matrix with the given vector, returning a new vector.
     * 
     * @param v
     *            The vector to be multiplied with the current matrix.
     * @return The new vector that is the result of the multiplication.
     */
    public VecF2 mul(VecF2 v) {
        return new VecF2(asArray()[0] * v.getX() + asArray()[1] * v.getY(), asArray()[2] * v.getX() + asArray()[3]
                * v.getY());
    }
}
