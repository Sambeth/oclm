package com.sambeth.oclm.rules.treasures

import com.sambeth.oclm.models._

// treasure from God's word assignments
object TreasuresImplicits {
  implicit class AssignElderTenMinutesTalk(val m: Elder) {
    def assignTenMinutesTalk = TenMinutesTalk(m)
  }

  implicit class AssignMinisterialServantTenMinutesTalk(val m: MinisterialServant) {
    def assignTenMinutesTalk = TenMinutesTalk(m)
  }

  implicit class AssignElderSpiritualGems(val m: Elder) {
    def assignSpiritualGems = SpiritualGems(m)
  }

  implicit class AssignMinisterialServantSpiritualGems(val m: MinisterialServant) {
    def assignSpiritualGems = SpiritualGems(m)
  }

  implicit class AssignBibleReading[M <: Member[Male, Student]](val m: M) {
    def assignBibleReading = BibleReading(m)
  }
}