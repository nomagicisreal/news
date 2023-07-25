package base.data

interface CustomContent

data class Article(val title: String, val content: String) : CustomContent
data class Post(val photo: String, val description: String) : CustomContent
data class Short(val title: String, val video: String) : CustomContent
data class Podcast(val title: String, val soundtrack: String) : CustomContent
data class Live(val title: String, val videoTrack: String) : CustomContent

enum class ContentCategoryType {
    Topic,
    Style,
    Field,
}
data class ContentCategory(val type: ContentCategoryType, val name: String)


data class ContentService(val contentCategory: ContentCategory, val customContent: CustomContent)