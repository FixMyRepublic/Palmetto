/**
 * This file is part of Palmetto.
 *
 * Palmetto is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Palmetto is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Palmetto.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.aksw.palmetto.data;

/**
 * This class contains the segmentations, probabilities and context vectors for a word set.
 * 
 * @author m.roeder
 * 
 */
public class SubsetVectors extends SubsetProbabilities {

    public double vectors[][];

    public SubsetVectors(int[] segments, int[][] conditions, double[][] vectors, double[] segmentProbabilities) {
        super(segments, conditions, segmentProbabilities);
        this.vectors = vectors;
    }
}
