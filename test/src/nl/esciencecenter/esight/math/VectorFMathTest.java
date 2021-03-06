package nl.esciencecenter.esight.math;

import static org.junit.Assert.assertEquals;

import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/* Copyright 2013 Netherlands eScience Center
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
 * Expected values for assertions were generated by Wolfram Alpha
 * http://www.wolframalpha.com/
 * 
 * @author Maarten van Meersbergen <m.van.meersbergen@esciencecenter.nl>
 * 
 */
public class VectorFMathTest {
    float EPSILON = 0.000001f;

    @Test
    public final void testDotVecF2VecF2() {
        VecF2 input1 = new VecF2(0.3f, 0.2f);
        VecF2 input2 = new VecF2(0.6f, 0.2f);
        float expected = 0.22f;
        assertEquals(expected, VectorFMath.dot(input1, input2), EPSILON);

        input1 = new VecF2(-0.3f, -0.2f);
        input2 = new VecF2(0.6f, 0.2f);
        expected = -0.22f;
        assertEquals(expected, VectorFMath.dot(input1, input2), EPSILON);

        input1 = new VecF2(1f, 1f);
        input2 = new VecF2(0.6f, 0.2f);
        expected = 0.8f;
        assertEquals(expected, VectorFMath.dot(input1, input2), EPSILON);

        input1 = new VecF2(1f, 1f);
        input2 = new VecF2(1f, 1f);
        expected = 2f;
        assertEquals(expected, VectorFMath.dot(input1, input2), EPSILON);

        input1 = new VecF2(0f, 0f);
        input2 = new VecF2(1f, 1f);
        expected = 0f;
        assertEquals(expected, VectorFMath.dot(input1, input2), EPSILON);

        input1 = new VecF2(Float.NaN, 0f);
        input2 = new VecF2(1f, 1f);
        expected = Float.NaN;
        assertEquals(expected, VectorFMath.dot(input1, input2), EPSILON);

    }

    @Test
    public final void testDotVecF3VecF3() {
        VecF3 input1 = new VecF3(0.3f, 0.2f, 0.5f);
        VecF3 input2 = new VecF3(0.6f, 0.2f, 0.8f);
        float expected = 0.62f;
        assertEquals(expected, VectorFMath.dot(input1, input2), EPSILON);

        input1 = new VecF3(-0.3f, -0.2f, -0.5f);
        input2 = new VecF3(0.6f, 0.2f, 0.8f);
        expected = -0.62f;
        assertEquals(expected, VectorFMath.dot(input1, input2), EPSILON);

        input1 = new VecF3(1f, 1f, 1f);
        input2 = new VecF3(0.6f, 0.2f, 0.8f);
        expected = 1.6f;
        assertEquals(expected, VectorFMath.dot(input1, input2), EPSILON);

        input1 = new VecF3(1f, 1f, 1f);
        input2 = new VecF3(1f, 1f, 1f);
        expected = 3f;
        assertEquals(expected, VectorFMath.dot(input1, input2), EPSILON);

        input1 = new VecF3(0f, 0f, 0f);
        input2 = new VecF3(1f, 1f, 1f);
        expected = 0f;
        assertEquals(expected, VectorFMath.dot(input1, input2), EPSILON);

        input1 = new VecF3(Float.NaN, 0f, 0f);
        input2 = new VecF3(1f, 1f, 1f);
        expected = Float.NaN;
        assertEquals(expected, VectorFMath.dot(input1, input2), EPSILON);
    }

    @Test
    public final void testDotVecF4VecF4() {
        VecF4 input1 = new VecF4(0.3f, 0.2f, 0.5f, 0.1f);
        VecF4 input2 = new VecF4(0.6f, 0.2f, 0.8f, 1.0f);
        float expected = 0.72f;
        assertEquals(expected, VectorFMath.dot(input1, input2), EPSILON);

        input1 = new VecF4(-0.3f, -0.2f, -0.5f, -0.1f);
        input2 = new VecF4(0.6f, 0.2f, 0.8f, 1.0f);
        expected = -0.72f;
        assertEquals(expected, VectorFMath.dot(input1, input2), EPSILON);

        input1 = new VecF4(1f, 1f, 1f, 1f);
        input2 = new VecF4(0.6f, 0.2f, 0.8f, 1.0f);
        expected = 2.6f;
        assertEquals(expected, VectorFMath.dot(input1, input2), EPSILON);

        input1 = new VecF4(1f, 1f, 1f, 1f);
        input2 = new VecF4(1f, 1f, 1f, 1f);
        expected = 4f;
        assertEquals(expected, VectorFMath.dot(input1, input2), EPSILON);

        input1 = new VecF4(0f, 0f, 0f, 0f);
        input2 = new VecF4(1f, 1f, 1f, 1f);
        expected = 0f;
        assertEquals(expected, VectorFMath.dot(input1, input2), EPSILON);

        input1 = new VecF4(Float.NaN, 0f, 0f, 0f);
        input2 = new VecF4(1f, 1f, 1f, 1f);
        expected = Float.NaN;
        assertEquals(expected, VectorFMath.dot(input1, input2), EPSILON);
    }

    @Test
    public final void testLengthVecF2() {
        VecF2 input1 = new VecF2(0.3f, 0.2f);
        float expected = 0.360555f;
        assertEquals(expected, VectorFMath.length(input1), EPSILON);

        input1 = new VecF2(-0.3f, -0.2f);
        expected = 0.360555f;
        assertEquals(expected, VectorFMath.length(input1), EPSILON);

        input1 = new VecF2(1f, 1f);
        expected = (float) Math.sqrt(2.0);
        assertEquals(expected, VectorFMath.length(input1), EPSILON);

        input1 = new VecF2(1f, 0f);
        expected = 1f;
        assertEquals(expected, VectorFMath.length(input1), EPSILON);

        input1 = new VecF2(0f, 0f);
        expected = 0f;
        assertEquals(expected, VectorFMath.length(input1), EPSILON);

        input1 = new VecF2(Float.NaN, 0f);
        expected = Float.NaN;
        assertEquals(expected, VectorFMath.length(input1), EPSILON);
    }

    @Test
    public final void testLengthVecF3() {
        VecF3 input1 = new VecF3(0.3f, 0.2f, 0.5f);
        float expected = 0.616441f;
        assertEquals(expected, VectorFMath.length(input1), EPSILON);

        input1 = new VecF3(-0.3f, -0.2f, -0.5f);
        expected = 0.616441f;
        assertEquals(expected, VectorFMath.length(input1), EPSILON);

        input1 = new VecF3(1f, 1f, 1f);
        expected = (float) Math.sqrt(3.0);
        assertEquals(expected, VectorFMath.length(input1), EPSILON);

        input1 = new VecF3(1f, 0f, 0f);
        expected = 1f;
        assertEquals(expected, VectorFMath.length(input1), EPSILON);

        input1 = new VecF3(0f, 0f, 0f);
        expected = 0f;
        assertEquals(expected, VectorFMath.length(input1), EPSILON);

        input1 = new VecF3(Float.NaN, 0f, 0f);
        expected = Float.NaN;
        assertEquals(expected, VectorFMath.length(input1), EPSILON);
    }

    @Test
    public final void testLengthVecF4() {
        VecF4 input1 = new VecF4(0.3f, 0.2f, 0.5f, 0.1f);
        float expected = 0.6245f;
        assertEquals(expected, VectorFMath.length(input1), EPSILON);

        input1 = new VecF4(-0.3f, -0.2f, -0.5f, -0.1f);
        expected = 0.6245f;
        assertEquals(expected, VectorFMath.length(input1), EPSILON);

        input1 = new VecF4(1f, 1f, 1f, 1f);
        expected = (float) Math.sqrt(4.0);
        assertEquals(expected, VectorFMath.length(input1), EPSILON);

        input1 = new VecF4(1f, 0f, 0f, 0f);
        expected = 1f;
        assertEquals(expected, VectorFMath.length(input1), EPSILON);

        input1 = new VecF4(0f, 0f, 0f, 0f);
        expected = 0f;
        assertEquals(expected, VectorFMath.length(input1), EPSILON);

        input1 = new VecF4(Float.NaN, 0f, 0f, 0f);
        expected = Float.NaN;
        assertEquals(expected, VectorFMath.length(input1), EPSILON);
    }

    @Test
    public final void testNormalizeVecF2() {
        VecF2 input1 = new VecF2(0.3f, 0.2f);
        VecF2 expected = new VecF2(0.8320503f, 0.5547002f);
        assertEquals(expected, VectorFMath.normalize(input1));

        input1 = new VecF2(-0.3f, -0.2f);
        expected = new VecF2(-0.8320503f, -0.5547002f);
        assertEquals(expected, VectorFMath.normalize(input1));

        input1 = new VecF2(1f, 1f);
        expected = new VecF2(0.70710677f, 0.70710677f);
        assertEquals(expected, VectorFMath.normalize(input1));

        input1 = new VecF2(1f, 0f);
        expected = new VecF2(1f, 0f);
        assertEquals(expected, VectorFMath.normalize(input1));

        input1 = new VecF2(0f, 0f);
        expected = new VecF2(0f, 0f);
        assertEquals(expected, VectorFMath.normalize(input1));

        input1 = new VecF2(Float.NaN, 0f);
        expected = new VecF2(Float.NaN, Float.NaN);
        assertEquals(expected, VectorFMath.normalize(input1));
    }

    @Test
    public final void testNormalizeVecF3() {
        VecF3 input1 = new VecF3(0.3f, 0.2f, 0.5f);
        VecF3 expected = new VecF3(0.48666432f, 0.32444286f, 0.81110716f);
        assertEquals(expected, VectorFMath.normalize(input1));

        input1 = new VecF3(-0.3f, -0.2f, -0.5f);
        expected = new VecF3(-0.48666432f, -0.32444286f, -0.81110716f);
        assertEquals(expected, VectorFMath.normalize(input1));

        input1 = new VecF3(1f, 1f, 1f);
        expected = new VecF3(0.57735026f, 0.57735026f, 0.57735026f);
        assertEquals(expected, VectorFMath.normalize(input1));

        input1 = new VecF3(1f, 0f, 0f);
        expected = new VecF3(1f, 0f, 0f);
        assertEquals(expected, VectorFMath.normalize(input1));

        input1 = new VecF3(0f, 0f, 0f);
        expected = new VecF3(0f, 0f, 0f);
        assertEquals(expected, VectorFMath.normalize(input1));

        input1 = new VecF3(Float.NaN, 0f, 0f);
        expected = new VecF3(Float.NaN, Float.NaN, Float.NaN);
        assertEquals(expected, VectorFMath.normalize(input1));
    }

    @Test
    public final void testNormalizeVecF4() {
        VecF4 input1 = new VecF4(0.3f, 0.2f, 0.5f, 0.1f);
        VecF4 expected = new VecF4(0.48038447f, 0.32025632f, 0.80064076f, 0.16012816f);
        assertEquals(expected, VectorFMath.normalize(input1));

        input1 = new VecF4(-0.3f, -0.2f, -0.5f, -0.1f);
        expected = new VecF4(-0.48038447f, -0.32025632f, -0.80064076f, -0.16012816f);
        assertEquals(expected, VectorFMath.normalize(input1));

        input1 = new VecF4(1f, 1f, 1f, 1f);
        expected = new VecF4(0.5f, 0.5f, 0.5f, 0.5f);
        assertEquals(expected, VectorFMath.normalize(input1));

        input1 = new VecF4(1f, 0f, 0f, 0f);
        expected = new VecF4(1f, 0f, 0f, 0f);
        assertEquals(expected, VectorFMath.normalize(input1));

        input1 = new VecF4(0f, 0f, 0f, 0f);
        expected = new VecF4(0f, 0f, 0f, 0f);
        assertEquals(expected, VectorFMath.normalize(input1));

        input1 = new VecF4(Float.NaN, 0f, 0f, 0f);
        expected = new VecF4(Float.NaN, Float.NaN, Float.NaN, Float.NaN);
        assertEquals(expected, VectorFMath.normalize(input1));
    }

    @Test
    public final void testCrossVecF3VecF3() {
        VecF3 input1 = new VecF3(0.3f, 0.2f, 0.5f);
        VecF3 input2 = new VecF3(0.6f, 0.2f, 0.8f);
        VecF3 expected = new VecF3(0.06000001f, 0.060000002f, -0.060000002f);
        assertEquals(expected, VectorFMath.cross(input1, input2));

        input1 = new VecF3(-0.3f, -0.2f, -0.5f);
        input2 = new VecF3(0.6f, 0.2f, 0.8f);
        expected = new VecF3(-0.06000001f, -0.060000002f, 0.060000002f);
        assertEquals(expected, VectorFMath.cross(input1, input2));

        input1 = new VecF3(1f, 1f, 1f);
        input2 = new VecF3(0.6f, 0.2f, 0.8f);
        expected = new VecF3(0.6f, -0.19999999f, -0.40000004f);
        assertEquals(expected, VectorFMath.cross(input1, input2));

        input1 = new VecF3(1f, 1f, 1f);
        input2 = new VecF3(1f, 1f, 1f);
        expected = new VecF3();
        assertEquals(expected, VectorFMath.cross(input1, input2));

        input1 = new VecF3(0f, 0f, 0f);
        input2 = new VecF3(1f, 1f, 1f);
        expected = new VecF3();
        assertEquals(expected, VectorFMath.cross(input1, input2));

        input1 = new VecF3(Float.NaN, 0f, 0f);
        input2 = new VecF3(1f, 1f, 1f);
        expected = new VecF3(0.0f, Float.NaN, Float.NaN);
        assertEquals(expected, VectorFMath.cross(input1, input2));
    }

    @Test
    public final void testCrossVecF4VecF4() {
        VecF4 input1 = new VecF4(0.3f, 0.2f, 0.5f, 0.1f);
        VecF4 input2 = new VecF4(0.6f, 0.2f, 0.8f, 1.0f);
        VecF4 expected = new VecF4(0.06000001f, 0.060000002f, -0.060000002f, 0.0f);
        assertEquals(expected, VectorFMath.cross(input1, input2));

        input1 = new VecF4(-0.3f, -0.2f, -0.5f, -0.1f);
        input2 = new VecF4(0.6f, 0.2f, 0.8f, 1.0f);
        expected = new VecF4(-0.06000001f, -0.060000002f, 0.060000002f, 0.0f);
        assertEquals(expected, VectorFMath.cross(input1, input2));

        input1 = new VecF4(1f, 1f, 1f, 1f);
        input2 = new VecF4(0.6f, 0.2f, 0.8f, 1.0f);
        expected = new VecF4(0.6f, -0.19999999f, -0.40000004f, 0.0f);
        assertEquals(expected, VectorFMath.cross(input1, input2));

        input1 = new VecF4(1f, 1f, 1f, 1f);
        input2 = new VecF4(1f, 1f, 1f, 1f);
        expected = new VecF4();
        assertEquals(expected, VectorFMath.cross(input1, input2));

        input1 = new VecF4(0f, 0f, 0f, 0f);
        input2 = new VecF4(1f, 1f, 1f, 1f);
        expected = new VecF4();
        assertEquals(expected, VectorFMath.cross(input1, input2));

        input1 = new VecF4(Float.NaN, 0f, 0f, 0f);
        input2 = new VecF4(1f, 1f, 1f, 1f);
        expected = new VecF4(0.0f, Float.NaN, Float.NaN, 0.0f);
        assertEquals(expected, VectorFMath.cross(input1, input2));
    }

    @Test
    public final void testToBufferFloatArray() {
        float[] input = new float[] { 0f, 1f, 2f, 3f, 4f, 5f, 6f };

        FloatBuffer expected = FloatBuffer.allocate(input.length);
        expected.put(input);
        expected.rewind();

        assertEquals(expected, VectorFMath.toBuffer(input));
    }

    @Test
    public final void testToBufferVecF2Array() {
        VecF2[] input = new VecF2[] { new VecF2(0f, 1f), new VecF2(2f, 3f), new VecF2(4f, 5f) };

        float[] expectedArray = new float[] { 0f, 1f, 2f, 3f, 4f, 5f };
        FloatBuffer expected = FloatBuffer.allocate(expectedArray.length);
        expected.put(expectedArray);
        expected.rewind();

        assertEquals(expected, VectorFMath.toBuffer(input));
    }

    @Test
    public final void testToBufferVecF3Array() {
        VecF3[] input = new VecF3[] { new VecF3(0f, 1f, 2f), new VecF3(3f, 4f, 5f) };

        float[] expectedArray = new float[] { 0f, 1f, 2f, 3f, 4f, 5f };
        FloatBuffer expected = FloatBuffer.allocate(expectedArray.length);
        expected.put(expectedArray);
        expected.rewind();

        assertEquals(expected, VectorFMath.toBuffer(input));
    }

    @Test
    public final void testToBufferVecF4Array() {
        VecF4[] input = new VecF4[] { new VecF4(0f, 1f, 2f, 3f), new VecF4(3f, 4f, 5f, 6f) };

        float[] expectedArray = new float[] { 0f, 1f, 2f, 3f, 3f, 4f, 5f, 6f };
        FloatBuffer expected = FloatBuffer.allocate(expectedArray.length);
        expected.put(expectedArray);
        expected.rewind();

        assertEquals(expected, VectorFMath.toBuffer(input));
    }

    @Test
    public final void testListToBuffer() {
        List<Float> input = new ArrayList<Float>();
        input.add(0f);
        input.add(1f);
        input.add(2f);
        input.add(3f);
        input.add(4f);
        input.add(5f);
        input.add(6f);

        float[] expectedArray = new float[] { 0f, 1f, 2f, 3f, 4f, 5f, 6f };

        FloatBuffer expected = FloatBuffer.allocate(expectedArray.length);
        expected.put(expectedArray);
        expected.rewind();

        assertEquals(expected, VectorFMath.listToBuffer(input));
    }

    @Test
    public final void testVec2ListToBuffer() {
        List<VecF2> input = new ArrayList<VecF2>();
        input.add(new VecF2(0f, 0f));
        input.add(new VecF2(1f, 0f));
        input.add(new VecF2(2f, 0f));
        input.add(new VecF2(3f, 0f));
        input.add(new VecF2(4f, 0f));
        input.add(new VecF2(5f, 0f));
        input.add(new VecF2(6f, 0f));

        float[] expectedArray = new float[] { 0f, 0f, 1f, 0f, 2f, 0f, 3f, 0f, 4f, 0f, 5f, 0f, 6f, 0f };

        FloatBuffer expected = FloatBuffer.allocate(expectedArray.length);
        expected.put(expectedArray);
        expected.rewind();

        assertEquals(expected, VectorFMath.vec2ListToBuffer(input));
    }

    @Test
    public final void testVec3ListToBuffer() {
        List<VecF3> input = new ArrayList<VecF3>();
        input.add(new VecF3(0f, 0f, 0f));
        input.add(new VecF3(1f, 0f, 0f));
        input.add(new VecF3(2f, 0f, 0f));
        input.add(new VecF3(3f, 0f, 0f));
        input.add(new VecF3(4f, 0f, 0f));
        input.add(new VecF3(5f, 0f, 0f));
        input.add(new VecF3(6f, 0f, 0f));

        float[] expectedArray = new float[] { 0f, 0f, 0f, 1f, 0f, 0f, 2f, 0f, 0f, 3f, 0f, 0f, 4f, 0f, 0f, 5f, 0f, 0f,
                6f, 0f, 0f };

        FloatBuffer expected = FloatBuffer.allocate(expectedArray.length);
        expected.put(expectedArray);
        expected.rewind();

        assertEquals(expected, VectorFMath.vec3ListToBuffer(input));
    }

    @Test
    public final void testVec4ListToBuffer() {
        List<VecF4> input = new ArrayList<VecF4>();
        input.add(new VecF4(0f, 0f, 0f, 0f));
        input.add(new VecF4(1f, 0f, 0f, 0f));
        input.add(new VecF4(2f, 0f, 0f, 0f));
        input.add(new VecF4(3f, 0f, 0f, 0f));
        input.add(new VecF4(4f, 0f, 0f, 0f));
        input.add(new VecF4(5f, 0f, 0f, 0f));
        input.add(new VecF4(6f, 0f, 0f, 0f));

        float[] expectedArray = new float[] { 0f, 0f, 0f, 0f, 1f, 0f, 0f, 0f, 2f, 0f, 0f, 0f, 3f, 0f, 0f, 0f, 4f, 0f,
                0f, 0f, 5f, 0f, 0f, 0f, 6f, 0f, 0f, 0f };

        FloatBuffer expected = FloatBuffer.allocate(expectedArray.length);
        expected.put(expectedArray);
        expected.rewind();

        assertEquals(expected, VectorFMath.vec4ListToBuffer(input));
    }

    @Test
    public final void testBezierCurve() {
        VecF4 startPoint = new VecF4(0f, 0f, 0f, 0f);
        VecF3 startControl = new VecF3(1f, 0f, 0f);
        VecF3 endControl = new VecF3(0f, 0f, 1f);
        VecF4 endPoint = new VecF4(10f, 10f, 10f, 0f);

        VecF4 step1 = new VecF4(0.0f, 0.0f, 0.0f, 0.0f);
        VecF4 step2 = new VecF4(0.523f, 0.28f, 0.25300002f, 0.0f);
        VecF4 step3 = new VecF4(1.4240001f, 1.0400001f, 0.94400007f, 0.0f);
        VecF4 step4 = new VecF4(2.6010003f, 2.16f, 1.9710002f, 0.0f);
        VecF4 step5 = new VecF4(3.9520004f, 3.52f, 3.2320006f, 0.0f);
        VecF4 step6 = new VecF4(5.375f, 5.0f, 4.6250005f, 0.0f);
        VecF4 step7 = new VecF4(6.768f, 6.48f, 6.0480003f, 0.0f);
        VecF4 step8 = new VecF4(8.029f, 7.84f, 7.399f, 0.0f);
        VecF4 step9 = new VecF4(9.056001f, 8.96f, 8.576f, 0.0f);
        VecF4 step10 = new VecF4(9.747001f, 9.719999f, 9.476999f, 0.0f);

        VecF4[] bezierPoints = VectorFMath.bezierCurve(10, startPoint, startControl, endControl, endPoint);

        assertEquals(step1, bezierPoints[0]);
        assertEquals(step2, bezierPoints[1]);
        assertEquals(step3, bezierPoints[2]);
        assertEquals(step4, bezierPoints[3]);
        assertEquals(step5, bezierPoints[4]);
        assertEquals(step6, bezierPoints[5]);
        assertEquals(step7, bezierPoints[6]);
        assertEquals(step8, bezierPoints[7]);
        assertEquals(step9, bezierPoints[8]);
        assertEquals(step10, bezierPoints[9]);

    }

    @Test
    public final void testDegreesBezierCurve() {
        VecF3 startPoint = new VecF3(0f, 0f, 0f);
        VecF3 startControl = new VecF3(1f, 0f, 0f);
        VecF3 endControl = new VecF3(0f, 0f, 1f);
        VecF3 endPoint = new VecF3(10f, 10f, 10f);

        VecF3[] expected = { new VecF3(360.0f, 360.0f, 360.0f), new VecF3(262.96298f, 262.72f, 262.693f),
                new VecF3(185.74397f, 185.36f, 185.26399f), new VecF3(126.08098f, 125.64f, 125.451004f),
                new VecF3(81.71199f, 81.28f, 80.99202f), new VecF3(50.374992f, 49.999996f, 49.625034f),
                new VecF3(29.807993f, 29.51999f, 29.088047f), new VecF3(17.748993f, 17.559984f, 17.11906f),
                new VecF3(11.935992f, 11.839972f, 11.456075f), new VecF3(10.106991f, 10.079955f, 9.83709f) };

        VecF3[] bezierPoints = VectorFMath.degreesBezierCurve(10, startPoint, startControl, endControl, endPoint);

        for (int i = 0; i < 10; i++) {
            assertEquals(expected[i], bezierPoints[i]);
        }

    }

    @Test
    public final void testInterpolateColors() {
        Color4 startColor = new Color4(0f, 0f, 0f, 1f);
        Color4 endColor = new Color4(1f, 1f, 1f, 1f);

        Color4[] expected = { new Color4(0.0f, 0.0f, 0.0f, 1.0f), new Color4(0.1f, 0.1f, 0.1f, 1.0f),
                new Color4(0.2f, 0.2f, 0.2f, 1.0f), new Color4(0.3f, 0.3f, 0.3f, 1.0f),
                new Color4(0.4f, 0.4f, 0.4f, 1.0f), new Color4(0.5f, 0.5f, 0.5f, 1.0f),
                new Color4(0.6f, 0.6f, 0.6f, 1.0f), new Color4(0.7f, 0.7f, 0.7f, 1.0f),
                new Color4(0.8f, 0.8f, 0.8f, 1.0f), new Color4(0.90000004f, 0.90000004f, 0.90000004f, 1.0f) };

        Color4[] result = VectorFMath.interpolateColors(10, startColor, endColor);

        for (int i = 0; i < 10; i++) {
            assertEquals(expected[i], result[i]);
        }
    }

}
