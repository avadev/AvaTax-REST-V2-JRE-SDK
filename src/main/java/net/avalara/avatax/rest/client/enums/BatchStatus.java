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
 * The status of a batch file
 */
public enum BatchStatus {
    /** 
     * Batch file has been received and is in the queue to be processed.
     */
    Waiting,

    /** 
     * Batch file experienced system errors and cannot be processed.
     */
    SystemErrors,

    /** 
     * Batch file is cancelled
     */
    Cancelled,

    /** 
     * Batch file has been completely processed.
     */
    Completed,

    /** 
     * Batch file is currently being created.
     */
    Creating,

    /** 
     * Batch file has been deleted.
     */
    Deleted,

    /** 
     * Batch file was processed with some errors.
     */
    Errors,

    /** 
     * Batch processing was paused.
     */
    Paused,

    /** 
     * Batch is currently being processed.
     */
    Processing,

}
    