package unicredit.extractor.entities

import unicredit.extractor.entities.Tenant._

/**
 * Created by n.padovano on 02/02/2016.
 */
case class PartyGroup(
                partyKey: String,
                isExternal: Boolean = false,
                tenant: Tenant,
                baseCurrCd: Option[String] = None,
                partyName: Option[String] = None,
                education: Option[String] = None,
                firstName: String,
                genderCd: Option[String] = None,
                isBankClient: Boolean = false,
                isNonResident: Boolean = false,
                isPep: Boolean = false,
                isToBeDeleted: Boolean = false,
                liquidNetWorth: Option[String] = None,
                maidenName: Option[String] = None,
                maritalStatusCd: Option[String] = None,
                middleName: Option[String] = None,
                namePrefix: Option[String] = None,
                nameSuffix: Option[String] = None,
                nameUpdateDate: Option[String] = None,
                occupationCd: Option[String] = None,
                otherName: Option[String] = None,
                partyCurrAnnualIncome: Option[String] = None,
                partyStatusCd: Option[String] = None,
                partyTypeCd: Option[String] = None,
                placeOfBirth: Option[String] = None,
                regionCd: Option[String] = None,
                sectorCd: Option[String] = None,
                sourceSystemCd: Option[String] = None,
                infoUpdateDate: Option[String] = None
                       ) {

}