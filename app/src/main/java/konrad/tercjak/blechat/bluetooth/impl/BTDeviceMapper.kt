package konrad.tercjak.blechat.bluetooth.impl

import android.annotation.SuppressLint
import android.bluetooth.BluetoothDevice
import konrad.tercjak.blechat.bluetooth.interfaces.*

@SuppressLint("MissingPermission")
fun BluetoothDevice.toBTDevice() = BTDevice(
    name = this.name,
    address = this.address
)