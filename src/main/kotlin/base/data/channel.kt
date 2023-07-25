package base.data

import base.enums.Equality

/**
 * [ChannelType]
 *
 * [StandardChannelType]
 * [ComplexChannelType]
 * [AuthorityChannelType]
 */

interface ChannelType

/**
 * everyone in the same channel have the same [Equality.Power], [Equality.Access], [Equality.Treatment], [Equality.Opportunity]
 */
enum class StandardChannelType : ChannelType {
    Call, // 1 to 1
    ClubHouse, // everyone to everyone
    Lobby, // everyone to anyone in the same space
}

/**
 * TODO
 */
enum class ComplexChannelType {
    Showcase, // 1 to all
    Cell; //
}

/**
 * TODO
 */
enum class AuthorityChannelType : ChannelType {
    Classroom, // 1 authority, A, at the beginning. A have power separating others into difference space
    Parliament, //
}

enum class StreamType {
    Text,
    Audio,
    Video,
}