/*******************************************************************************
 * Copyright 2014, 2016 gwt-ol3
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package ol.control;

import ol.GwtOLBaseTestCase;
import ol.Object;

/**
 * 
 * @author Tino Desjardins
 *
 */
public class ScaleLineTest extends GwtOLBaseTestCase {

    public void testScaleLine() {

        injectUrlAndTest(() -> {
            ScaleLine scaleLine = new ScaleLine();

            assertNotNull(scaleLine);
            assertTrue(scaleLine instanceof Object);
            assertTrue(scaleLine instanceof Control);

            ScaleLineOptions scaleLineOptions = new ScaleLineOptions();
            scaleLineOptions.setMinWidth(100);
            ScaleLine scaleLine2 = new ScaleLine(scaleLineOptions);
            assertTrue(scaleLine2 instanceof Object);
            assertTrue(scaleLine2 instanceof Control);

        });

    }

}
