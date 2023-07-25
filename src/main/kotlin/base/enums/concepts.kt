package base.enums

import base.ApplicationVision
import base.ApplicationConcern

/**
 * [Need], [Development], [] used in [ApplicationVision]
 */
enum class Need {
    Drink,
    Social;
}

enum class Development {
    Evolution,
    Migration,
    Replacement;
}


/**
 * [Diversity], [Equality] used in [ApplicationConcern]
 */
enum class Diversity {
    Race,
    Gender,
    Age,
    Physical,
    Language,
    Mental,
    Religion,
    Ethnicity,
    Profession,
    Socioeconomic,
    Marital;
}

enum class Equality {
    Power,
    Access,
    Treatment,
    Opportunity,
}