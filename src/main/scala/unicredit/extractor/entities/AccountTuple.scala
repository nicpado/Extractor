package unicredit.extractor.entities

import unicredit.extractor.entities.Tenant._
/**
 * Created by n.padovano on 02/02/2016.
 */
case class AccountTuple(
                  accountKey: String,
                  tenantCd: Tenant,
                  accountNumber: String,
                  isExternal: Boolean = true) extends Serializable with Tuple {

}
