package base

import base.enums.*

val emptyVision: ApplicationVision = ApplicationVision()
val emptyNeed: MutableMap<Need, String> = Need.values().associateWith { "" }.toMutableMap()
val emptyDevelopment: MutableMap<Development, String> = Development.values().associateWith { "" }.toMutableMap()

val emptyConcern: ApplicationConcern = ApplicationConcern()
val emptyDiversities: MutableMap<Diversity, String> = Diversity.values().associateWith { "" }.toMutableMap()
val emptyEqualities: MutableMap<Equality, String> = Equality.values().associateWith { "" }.toMutableMap()
