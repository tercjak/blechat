package konrad.tercjak.blechat.bluetooth.interfaces

data class ChatMsg(
    val msg: String,
    val senderName: String,
    val isFromLocalUser: Boolean
)