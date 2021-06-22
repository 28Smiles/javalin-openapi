package net.dzikoysk.openapi.processor.annotations

import net.dzikoysk.openapi.annotations.OpenApiResponse
import net.dzikoysk.openapi.processor.processing.AnnotationMirrorMapper
import javax.lang.model.element.AnnotationMirror

internal class OpenApiResponseInstance(mirror: AnnotationMirror) : AnnotationMirrorMapper(mirror) {

    fun content(): List<OpenApiContentInstance> =
        getArray("content", AnnotationMirror::class.java) { OpenApiContentInstance(it) }

    fun description(): String =
        getString("description")

    fun status(): String =
        getString("status")

    fun annotationType(): Class<out Annotation> =
        OpenApiResponse::class.java

}