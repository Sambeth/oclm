package com.sambeth.oclm.rules.treasures

import com.sambeth.oclm.models.*

// treasure from God's word assignments
trait AssignTenMinutesTalk[M]:
  extension(m: M) def assignTenMinutesTalk: TenMinutesTalk

given assignElderTenMinutesTalk: AssignTenMinutesTalk[Elder] with
  extension(m: Elder) def assignTenMinutesTalk: TenMinutesTalk = TenMinutesTalk(m)

given assignMinisterialServantTenMinutesTalk: AssignTenMinutesTalk[MinisterialServant] with
  extension(m: MinisterialServant) def assignTenMinutesTalk: TenMinutesTalk = TenMinutesTalk(m)


// spiritual gems
trait AssignSpiritualGems[M]:
  extension (m: M) def assignSpiritualGems: SpiritualGems

given assignElderSpiritualGems: AssignSpiritualGems[Elder] with
  extension(m: Elder) def assignSpiritualGems: SpiritualGems = SpiritualGems(m)

given assignMinisterialServantSpiritualGems: AssignSpiritualGems[MinisterialServant] with
  extension(m: MinisterialServant) def assignSpiritualGems: SpiritualGems = SpiritualGems(m)


// bible reading
trait AssignBibleReading[M]:
  extension (m: M) def assignBibleReading: BibleReading

given assignElderBibleReading: AssignBibleReading[Member[Male, Student]] with
  extension(m: Member[Male, Student]) def assignBibleReading: BibleReading = BibleReading(m)
