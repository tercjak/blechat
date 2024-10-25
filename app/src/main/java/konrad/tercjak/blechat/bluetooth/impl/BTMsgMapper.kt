package konrad.tercjak.blechat.bluetooth.impl

import konrad.tercjak.blechat.bluetooth.interfaces.*

fun String.toBTMsg(isFromLocalUser: Boolean): ChatMsg {
    val name = substringBeforeLast("#")
    val message = substringAfter("#")
    return ChatMsg(
        senderName = name,
        msg = message,
        isFromLocalUser = isFromLocalUser
    )
}

fun ChatMsg.toByteArray(): ByteArray {
    return "$senderName#$msg".encodeToByteArray()
}