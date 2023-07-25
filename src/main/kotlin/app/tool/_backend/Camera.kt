package app.tool._backend

import base.*
import base.enums.Development
import base.enums.Need


data class Camera(
    val constancy: Map<Need, Set<String>>,
    val changes: Map<Development, Set<String>>,
    val appRelations: Set<Application>,
    val appConditioning: Set<String>,
    override val vision: ApplicationVision,
    override val concern: ApplicationConcern
) : Application()