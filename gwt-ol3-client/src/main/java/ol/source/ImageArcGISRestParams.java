/*******************************************************************************
 * Copyright 2014, 2017 gwt-ol3
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
package ol.source;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * @author Peter Zanetti
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class ImageArcGISRestParams {

    @JsOverlay
    private static final String DELIMITER = ",";

    @JsOverlay
    private static final String SHOW = "show:";

    @JsOverlay
    private static final String HIDE = "hide:";

    @JsProperty(name = "LAYERS")
    public native void setLayers(String layers);

    @JsOverlay
    public final void showLayers(String... layerNames) {
        setLayers(ImageArcGISRestParams.SHOW + String.join(ImageArcGISRestParams.DELIMITER, layerNames));
    }

    @JsOverlay
    public final void hideLayers(String... layerNames) {
        setLayers(ImageArcGISRestParams.HIDE + String.join(ImageArcGISRestParams.DELIMITER, layerNames));
    }

    @JsProperty(name = "LAYERS")
    public native String getLayers();

    @JsProperty(name = "FORMAT")
    public native void setFormat(String format);

    @JsProperty(name = "F")
    public native void setF(String f);

    @JsProperty(name = "TRANSPARENT")
    public native void setTransparent(boolean transparent);
}
