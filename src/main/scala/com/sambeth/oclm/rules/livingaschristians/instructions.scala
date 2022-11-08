package com.sambeth.oclm.rules.livingaschristians

import com.sambeth.oclm.models.*

trait CanBeAssignedCongregationBibleStudy[A <: Member[Male, Student], B <: LivingAsChristians] {
  def assign(a: A, b: CongregationBibleStudy): String
}

given elderCanBeAssignedCongregationBibleStudy: CanBeAssignedCongregationBibleStudy[Elder, CongregationBibleStudy] = new CanBeAssignedCongregationBibleStudy[Elder, CongregationBibleStudy] {
  def assign(a: Elder, b: CongregationBibleStudy): String = s"${a.firstName} ${a.lastName}"
}

given ministerialServantCanBeAssignedCongregationBibleStudy: CanBeAssignedCongregationBibleStudy[MinisterialServant, CongregationBibleStudy] = new CanBeAssignedCongregationBibleStudy[MinisterialServant, CongregationBibleStudy] {
  def assign(a: MinisterialServant, b: CongregationBibleStudy): String = s"${a.firstName} ${a.lastName}"
}


trait CanBeAssignedAdHocAssignment[A <: Member[Male, Student], B <: LivingAsChristians] {
  def assign(a: A, b: AdHoc): String
}

given elderCanBeAssignedAdHocAssignment: CanBeAssignedAdHocAssignment[Elder, AdHoc] = new CanBeAssignedAdHocAssignment[Elder, AdHoc] {
  def assign(a: Elder, b: AdHoc): String = s"${a.firstName} ${a.lastName}"
}

given ministerialServantCanBeAssignedAdHocAssignment: CanBeAssignedAdHocAssignment[MinisterialServant, AdHoc] = new CanBeAssignedAdHocAssignment[MinisterialServant, AdHoc] {
  def assign(a: MinisterialServant, b: AdHoc): String = s"${a.firstName} ${a.lastName}"
}
