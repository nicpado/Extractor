package unicredit.extractor.layers.data

import org.joda.time.DateTime
import unicredit.extractor.entities.{BankField, Tenant, OrganizationTuple}

import unicredit.Config
import unicredit.extractor.entities.Tenant._
import unicredit.extractor.entities.OrganizationTuple

class DataAccessLayerMock {

  def retrieveTenantCode: Tenant = Tenant.ITALY
  def retrieveBatchId: Integer = 16020311
  def retriveDateTime: DateTime = DateTime.now

  def fromEmptyToNone(list: List[String]): List[Option[String]] =
    list.map { elem => if (elem.isEmpty) None else Some(elem) }

  def fromBankLineToOrganizationTuple(line: String): OrganizationTuple = {
    val fields = fromEmptyToNone( line.split(Config.separator).toList )

    val (_organizationKey, _identificationNumber) =
      fields(BankField.BIC8.id) match {
        case None       => (fields(BankField.NAME.id).getOrElse(Config.nullConstant),
                            fields(BankField.NAME.id).getOrElse(Config.nullConstant))

        case Some(bic8) => (bic8.substring(0, 6), bic8.substring(0, 4))
      }

    OrganizationTuple(
      tenantCd = retrieveTenantCode,
      organizationKey = _organizationKey,
      identificationNumber = _identificationNumber,
      organizationName = fields(BankField.NAME.id).getOrElse(Config.nullConstant),
      batchDateTime = retriveDateTime,
      batchId  = retrieveBatchId)

  }
}

/*
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
                       organizationName: String)*/


/**
 *
 *
 * "3,HYVEITMM,XXX,UNICREDIT BANK AG MILAN BRANCH," +
   "VIA TOMMASO GROSSI 10,IT,MILANO,ANY,Low,Low,UNCRITMMXXX,Y,2016-02-01T14:53:44+01:00"
 */