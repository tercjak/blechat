package konrad.tercjak.blechat

import konrad.tercjak.blechat.bluetooth.interfaces.*


data class BTUiState(
    val scannedDevices: List<BTDevice> = emptyList(),
    val pairedDevices: List<BTDevice> = emptyList(),
    val isConnected: Boolean = false,
    val isConnecting: Boolean = false,
    val errorMsg: String? = null,
    val messages: List<ChatMsg> = emptyList()
)