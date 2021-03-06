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
package org.aksw.palmetto;

/**
 * A coherence measure calculates the coherence of a given set of top word sets.
 * 
 * @author Michael Röder
 * 
 */
public interface Coherence {

    /**
     * Calculates the coherence for the given set of top word sets.
     * 
     * @param wordsets
     *            set of topic top words
     * @return a double array containing the coherences for the given top word
     *         sets.
     */
    public double[] calculateCoherences(String[][] wordsets);

    /**
     * Returns the name of the coherence.
     * 
     * @return the name of the coherence
     */
    public String getName();
}
