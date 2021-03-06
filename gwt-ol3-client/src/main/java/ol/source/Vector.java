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
package ol.source;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import ol.Collection;
import ol.Coordinate;
import ol.Extent;
import ol.Feature;
import ol.GenericFunction;

/**
 * Provides a source of features for vector layers. Vector features provided by
 * this source are suitable for editing. See {@link ol.source.VectorTile} for
 * vector data that is optimized for rendering.
 *
 * @author sbaumhekel
 */
@JsType(isNative = true)
public class Vector extends Source {

    public Vector() {}

    public Vector(VectorOptions vectorOptions) {}

    /**
     * Add a single feature to the source. If you want to add a batch of
     * features at once, call {@link ol.source.Vector#addFeatures
     * source.addFeatures()} instead.
     *
     * @param feature
     *            Feature to add.
     */
    public native void addFeature(Feature feature);

    /**
     * Add a batch of features to the source.
     *
     * @param features
     *            Features to add.
     */
    public native void addFeatures(Feature[] features);

    /**
     * Remove all features from the source.
     *
     * @param opt_fast
     *            Skip dispatching of removefeature events.
     */
    public native void clear(boolean opt_fast);

    /**
     * Iterate through all features whose bounding box intersects the provided extent (note that the feature's geometry may not intersect the extent), calling the callback with each feature. If the callback returns a "truthy" value, iteration will stop and the function will return the same value.
     *
     * If you are interested in features whose geometry intersects an extent, call the {@link #forEachFeatureIntersectingExtent(Extent, GenericFunction)} method instead.
     *
     * When useSpatialIndex is set to false, this method will loop through all features, equivalent to #forEachFeature().
     *
     * @param extent Extent.
     * @param callback Called with each feature whose bounding box intersects the provided extent.
     */
    public native void forEachFeatureInExtent(Extent extent, GenericFunction<Feature, ?> callback);

    /**
     * Iterate through all features whose geometry intersects the provided
     * extent, calling the callback with each feature. If the callback returns a
     * "truthy" value, iteration will stop and the function will return the same
     * value. If you only want to test for bounding box intersection, call the
     * {@link #forEachFeatureInExtent(Extent, GenericFunction)} method instead.
     *
     * @param extent Extent.
     * @param callback Called with each feature whose geometry intersects the provided extent.
     */
    public native void forEachFeatureIntersectingExtent(Extent extent, GenericFunction<Feature, ?> callback);

    /**
     * Get the closest feature to the provided coordinate.
     *
     * This method is not available when the source is configured with
     * `useSpatialIndex` set to `false`.
     *
     * @param coordinate
     *            Coordinate.
     * @return {ol.Feature} Closest feature.
     */
    public native Feature getClosestFeatureToCoordinate(Coordinate coordinate);

    /**
     * Get the extent of the features currently in the source.
     *
     * This method is not available when the source is configured with
     * `useSpatialIndex` set to `false`.
     *
     * @return {!ol.Extent} Extent.
     */
    public native Extent getExtent();

    /**
     * Get a feature by its identifier (the value returned by feature.getId()).
     * Note that the index treats string and numeric identifiers as the same. So
     * `source.getFeatureById(2)` will return a feature with id `'2'` or `2`.
     *
     * @param id
     *            Feature identifier {string|number}.
     * @return {ol.Feature} The feature (or `null` if not found).
     */
    public native Feature getFeatureById(String id);

    /**
     * Get all features on the source.
     *
     * @return features.
     */
    public native Feature[] getFeatures();

    /**
     * Get all features whose geometry intersects the provided coordinate.
     *
     * @param coordinate
     *            Coordinate.
     * @return features.
     */
    public native Feature[] getFeaturesAtCoordinate(Coordinate coordinate);

    /**
     * Get the features collection associated with this source. Will be `null`
     * unless the source was configured with `useSpatialIndex` set to `false`,
     * or with an {@link ol.Collection} as `features`.
     *
     * @return features collection
     */
    public native Collection<Feature> getFeaturesCollection();

    /**
     * Get all features in the provided extent. Note that this returns all
     * features whose bounding boxes intersect the given extent (so it may
     * include features whose geometries do not intersect the extent).
     *
     * This method is not available when the source is configured with
     * `useSpatialIndex` set to `false`.
     *
     * @param extent
     *            Extent.
     * @return features.
     */
    public native Feature[] getFeaturesInExtent(Extent extent);

    /**
     * @return format associated with this source
     */
    public native ol.format.Feature getFormat();

    /**
     * Remove a single feature from the source. If you want to remove all
     * features at once, use the {@link ol.source.Vector#clear source.clear()}
     * method instead.
     *
     * @param feature
     *            Feature to remove.
     */
    public native void removeFeature(Feature feature);

    /**
     * Events emitted by {@link ol.source.Vector} instances are instances of this
     * type.
     *
     * @author sbaumhekel
     */
    @JsType(isNative = true)
    public interface Event extends ol.events.Event {

        /**
         * The feature being added or removed.
         *
         * @return {@link ol.Feature}
         */
        @JsProperty
        Feature getFeature();

    }

}
