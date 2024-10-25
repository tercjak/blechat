package konrad.tercjak.blechat.bluetooth.interfaces

interface ConnectionResult {
    object ConnectionEstablished : ConnectionResult
    class ConnectionError(val msg: String) : ConnectionResult

    data class TransferSucceeded(val msg: ChatMsg) : ConnectionResult
}