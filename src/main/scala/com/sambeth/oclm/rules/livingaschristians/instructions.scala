package com.sambeth.oclm.rules.livingaschristians

import com.sambeth.oclm.models.*


// congregation bible study
trait AssignCongregationBibleStudy[M]:
  extension (m: M) def assignCongregationBibleStudy: CongregationBibleStudy

given assignElderCongregationBibleStudy: AssignCongregationBibleStudy[Elder] with
  extension(m: Elder) def assignCongregationBibleStudy: CongregationBibleStudy = CongregationBibleStudy(m)


// ad hoc
trait AssignAdHoc[M]:
  extension (m: M) def assignAdHoc(title: String): AdHoc

given assignElderAdHoc: AssignAdHoc[Elder] with
  extension(m: Elder) def assignAdHoc(title: String): AdHoc = AdHoc(title, m)

given assignMinisterialServantAdHoc: AssignAdHoc[MinisterialServant] with
  extension(m: MinisterialServant) def assignAdHoc(title: String): AdHoc = AdHoc(title, m)