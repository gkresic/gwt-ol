/*******************************************************************************
 * Copyright 2014, 2019 gwt-ol
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
package ol.style;

import elemental2.dom.CanvasGradient;
import elemental2.dom.CanvasPattern;
import jsinterop.annotations.JsType;
import ol.color.Color;

/**
 * Set fill style for vector features.
 *
 * @author Tino Desjardins
 */
@JsType(isNative = true)
public class Fill {

    public Fill() {}

    public Fill(FillOptions fillOptions) {}

    /**
     * Set the color.
     *
     * @param color
     *          color.
     */
    public native void setColor(Color color);

    /**
     * Set the canvasGradient.
     *
     * @param canvasGradient
     *          canvasGradient.
     */
    public native void setColor(CanvasGradient canvasGradient);

    /**
     * Set the canvasPattern.
     *
     * @param canvasPattern
     *          canvasPattern.
     */
    public native void setColor(CanvasPattern canvasPattern);

    /**
     * Get the fill color
     * @return
     */
    public native Color getColor();

}
