package com.sambeth.oclm.rules.livingaschristians

import com.sambeth.oclm.models._


object LivingAsChristiansImplicits {
  implicit class AssignCongregationBibleStudy(val m: Elder) {
    def assignCongregationBibleStudy = CongregationBibleStudy(m)
  }

  implicit class AssignElderAdHoc(val m: Elder) {
    def assignAdHoc(title: String) = AdHoc(title, m)
  }

  implicit class AssignMinisterialServantAdHoc(val m: MinisterialServant) {
    def assignAdHoc(title: String) = AdHoc(title, m)
  }
}
