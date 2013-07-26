package nl.esciencecenter.esight;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JPopupMenu;

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
 * @author maarten Common (extendible) class for a separate Interface Panel.
 * 
 */
public abstract class ESightInterfacePanel extends JPanel {
    private static final long serialVersionUID = -4937089344123608040L;

    /**
     * Creates a new default JPanel with a BorderLayout.
     */
    public ESightInterfacePanel() {
        JPopupMenu.setDefaultLightWeightPopupEnabled(false);

        setLayout(new BorderLayout(0, 0));

        setVisible(true);
    }
}
