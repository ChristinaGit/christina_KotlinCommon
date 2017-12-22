package christina.common.exception

open class IllegalOperationException
@JvmOverloads
constructor(
    message: String? = null,
    cause: Throwable? = null,
    enableSuppression: Boolean = ExceptionDefaultSettings.enableSuppression,
    writableStackTrace: Boolean = ExceptionDefaultSettings.writableStackTrace
) : RuntimeException(message, cause, enableSuppression, writableStackTrace)