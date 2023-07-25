package base.enums

/**
 * techs are more basic, physic than functions
 *
 * [Tech]
 * [TechTimeSeries]
 */

interface Tech
/**
 * [TechComputer]
 * [TechDetector]
 */

enum class TechComputer : Tech {
    Operate,
    Render,
    Store,
}

enum class TechDetector : Tech {
    Distance,
    Direction,
    View,
    Location,
    Temperature,
    Moisture,
    ElectromagneticWave,
}

//---------------

interface TechTimeSeries : Tech
/**
 * [TechGenerator]
 * [TechRecorder]
 * [TechConnector]
 */

enum class TechRecorder : TechTimeSeries {
    Time,
    Sound,
    Video,
}

enum class TechConnector : TechTimeSeries {
    BlueTooth,
    Network,
    Sonar,
}

enum class TechGenerator : TechTimeSeries {
    Lighter,
    Projector,
    Heater,
    Locator,
}