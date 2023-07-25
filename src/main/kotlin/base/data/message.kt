package base.data

/**
 *
 * [MessageType]
 * [MessageFileType]
 *
 * [TextType]
 * [StreamType]
 * [PictureFileType]
 * [VideoFileType]
 * [DocumentFileType]
 *
 * [MessageTarget]
 *
 * [Message]
 *
 */

interface MessageType
interface MessageFileType : MessageType


enum class TextType : MessageType {
    Text,
    EmojiText,
    RichText,
}

enum class PictureFileType : MessageFileType {
    Jpg,
    Png,
    Pdf,
    Svg,
    Xml,
    //...
}

enum class AudioFileType : MessageFileType {
    Mp3,
    Wav,
}

enum class VideoFileType : MessageFileType {
    Gif,
    Mp4,
    Mov,
    M4a,
    Avi,
    //...
}

enum class DocumentFileType : MessageFileType {
    Csv,
    Json,
    Docx,
    Odt,
    Xls,
    Xlsx,
    Ods,
    Zip;
}

enum class MessageTarget {
    ToKnown,
    ToKnowns, // TODO
    ToUnknown, // TODO
    ToUnknowns, // TODO
}

data class Message<T : MessageType>(val type: T, val target: MessageTarget, val data: Any) {
    val message: Any
        get() = when (type) {
            is TextType -> data as String
            is MessageFileType -> throw NotImplementedError()
            else -> throw NotImplementedError()
        }
}