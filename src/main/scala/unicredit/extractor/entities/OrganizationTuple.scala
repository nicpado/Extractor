package unicredit.extractor.entities

import org.joda.time.DateTime
import unicredit.extractor.entities.Tenant._
import unicredit.Config

case class OrganizationTuple(
                       tenantCd: Tenant,
                       isToBeDeleted: Boolean = false,
                       organizationKey: String,
                       alternativeName: Option[String] = None,
                       batchDateTime: DateTime,
                       batchId: Integer,
                       closedDate: Option[DateTime] = None,
                       contactOffice: Option[String] = None,
                       identificationNumber: String,
                       isApprovedBroker: Boolean = false,
                       locationCd: Option[String] = None,
                       organizationCrd: Option[String] = None,
                       organizationName: String) extends Serializable with Tuple {


  def toRow: Iterable[Any] = List(
    tenantCd,
    isToBeDeleted,
    organizationKey,
    alternativeName.getOrElse(Config.nullConstant),
    batchDateTime,
    batchId,
    closedDate.getOrElse(Config.nullConstant),
    contactOffice.getOrElse(Config.nullConstant),
    identificationNumber,
    isApprovedBroker,
    locationCd.getOrElse(Config.nullConstant),
    organizationCrd.getOrElse(Config.nullConstant),
    organizationName)

}
