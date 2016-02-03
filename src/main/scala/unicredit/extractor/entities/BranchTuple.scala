package unicredit.extractor.entities

import org.joda.time.DateTime
import unicredit.extractor.entities.Tenant._

/**
 * Created by n.padovano on 02/02/2016.
 */
case class BranchTuple(
                      branchKey: String,
                      countryCode: String,
                      organizationKey: String,
                      tenantCode: Tenant,
                      approvOfficialName: Option[String] = None,
                      approvOfficialTitle: Option[String] = None,
                      batchDateTime: DateTime,
                      batchId: Integer,
                      branchName: String,
                      branchNumber: Option[String] = None,
                      branchRSSDID: Option[String] = None,
                      contactAgency: Option[String] = None,
                      contactAreaCd: Option[String] = None,
                      contactFirstName: Option[String] = None,
                      contactLastName: Option[String] = None,
                      contactMiddleName: Option[String] = None,
                      contactTitle: Option[String] = None,
                      crtResolutionCD: Option[String] = None,
                      effectiveDate: Option[DateTime] = None,
                      expirationDate: Option[DateTime] = None,
                      geoDemographicGroupCd: Option[String] = None,
                      isExemptBranch: Boolean = false,
                      isToBeDeleted: Boolean = false,
                      managerRepKey: Option[String] = None,
                      regionCd: Option[String] = None,
                      regulatorCd: Option[String] = None,
                      routingTypeCd: Option[String] = None,
                      subRegionCd: Option[String] = None) extends Serializable with Tuple {
  def test = {
    val lStr1 = List("ciao","prova","test")
    val lStr2 = List("1","2","3")

    for {
      (a, b) <- (lStr1, lStr2)
      k = a+b
    } yield k
  }

}
