package base

import base.enums.*

abstract class Application {
    abstract val vision: ApplicationVision
    abstract val concern: ApplicationConcern
}

data class ApplicationVision(
    val constancy: Map<Need, String> = emptyNeed,
    val changes: Map<Development, String> = emptyDevelopment,
)

data class ApplicationConcern(
    val diversities: Map<Diversity, String> = emptyDiversities,
    val equalities: Map<Equality, String> = emptyEqualities,
    val inclusionChallenge: String = "",
)

// TODO: migrate between applications