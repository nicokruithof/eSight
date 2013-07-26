package nl.esciencecenter.esight.models;

import nl.esciencecenter.esight.math.Color4;
import nl.esciencecenter.esight.math.VecF3;
import nl.esciencecenter.esight.shaders.ShaderProgram;

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
 * Mockup class for a lightsource, currently unused. Does not actually introduce
 * a lightsource to a scene.
 * 
 * @author Maarten van Meersbergen <m.van.meersbergen@esciencecenter.nl>
 * 
 */
public class LightSource {
    private final Color4 color;
    private final VecF3 position;

    public LightSource(Color4 color, VecF3 position) {
        this.color = color;
        this.position = position;
    }

    public void use(ShaderProgram p) {
        p.setUniformVector("LightColor", color);
        p.setUniformVector("LightPos", position);
    }
}
