package net.avalara.avatax.rest.client.enums;

/*
 * AvaTax Software Development Kit for Java JRE based environments
 *
 * (c) 2004-2018 Avalara, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Dustin Welden <dustin.welden@avalara.com>
 * @copyright  2004-2018 Avalara, Inc.
 * @license    https://www.apache.org/licenses/LICENSE-2.0
 * @link       https://github.com/avadev/AvaTax-REST-V2-JRE-SDK
 */

/**
 * The address resolution quality of an address validation result
 */
public enum ResolutionQuality {
    /** 
     * Location was not geocoded
     */
    NotCoded,

    /** 
     * Location was already geocoded on the request
     */
    External,

    /** 
     * Avalara-defined country centroid
     */
    CountryCentroid,

    /** 
     * Avalara-defined state / province centroid
     */
    RegionCentroid,

    /** 
     * Geocoded at a level more coarse than a PostalCentroid1
     */
    PartialCentroid,

    /** 
     * Largest postal code (zip5 in US, left three in CA, etc
     */
    PostalCentroidGood,

    /** 
     * Better postal code (zip7 in US)
     */
    PostalCentroidBetter,

    /** 
     * Best postal code (zip9 in US, complete postal code elsewhere)
     */
    PostalCentroidBest,

    /** 
     * Nearest intersection
     */
    Intersection,

    /** 
     * Interpolated to rooftop
     */
    Interpolated,

    /** 
     * Assumed to be rooftop level, non-interpolated
     */
    Rooftop,

    /** 
     * Pulled from a static list of geocodes for specific jurisdictions
     */
    Constant,

}
    