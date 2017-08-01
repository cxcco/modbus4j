package com.serotonin.modbus4j.test;

import java.util.concurrent.TimeUnit;

import com.alibaba.fastjson.JSON;
import com.serotonin.modbus4j.BatchRead;
import com.serotonin.modbus4j.BatchResults;
import com.serotonin.modbus4j.ModbusFactory;
import com.serotonin.modbus4j.ModbusMaster;
import com.serotonin.modbus4j.MultiSlaveBatchResults;
import com.serotonin.modbus4j.code.DataType;
import com.serotonin.modbus4j.ip.IpParameters;
import com.serotonin.modbus4j.locator.BaseLocator;
import com.serotonin.modbus4j.serial.rxtxImpl.SerialParameters;
import com.serotonin.modbus4j.serial.rxtxImpl.SerialPortWrapperRxtxImpl;

public class BatchTest {
	public static void main(String[] args) throws Exception {
		// IpParameters tcpParameters = new IpParameters();
		// tcpParameters.setHost("localhost");
		//
		// ModbusFactory modbusFactory = new ModbusFactory();
		// ModbusMaster master = modbusFactory.createTcpMaster(tcpParameters,
		// true);
		String commPortId = "COM2";

		SerialParameters serialParameters = new SerialParameters(commPortId);
		SerialPortWrapperRxtxImpl wrapper = new SerialPortWrapperRxtxImpl(serialParameters);
		ModbusMaster master = new ModbusFactory().createRtuMaster(wrapper);
		master.setTimeout(2000);
		master.setRetries(1);
		master.init();
		int slaveId = 1;
		try {
			while (true) {
				BatchRead batchRead = new BatchRead();

				// batchRead.addLocator("00011 sb true",
				// BaseLocator.coilStatus(slaveId, 10));
				// batchRead.addLocator("00012 sb false",
				// BaseLocator.coilStatus(slaveId, 11));
				// batchRead.addLocator("00013 sb true",
				// BaseLocator.coilStatus(slaveId, 12));
				// batchRead.addLocator("00014 sb true",
				// BaseLocator.coilStatus(slaveId, 13));
				//
				// batchRead.addLocator("10011 sb false",
				// BaseLocator.inputStatus(slaveId, 10));
				// batchRead.addLocator("10012 sb false",
				// BaseLocator.inputStatus(slaveId, 11));
				// batchRead.addLocator("10013 sb true",
				// BaseLocator.inputStatus(slaveId, 12));
				// batchRead.addLocator("10014 sb false",
				// BaseLocator.inputStatus(slaveId, 13));

				batchRead.addLocator("40016-0", BaseLocator.holdingRegisterBit(slaveId, 1, 0));
				batchRead.addLocator("40016-1", BaseLocator.holdingRegisterBit(slaveId, 1, 1));
				batchRead.addLocator("40016-2", BaseLocator.holdingRegisterBit(slaveId, 1, 2));
				batchRead.addLocator("40016-3", BaseLocator.holdingRegisterBit(slaveId, 1, 3));
				batchRead.addLocator("40016-4", BaseLocator.holdingRegisterBit(slaveId, 1, 4));
				batchRead.addLocator("40016-5", BaseLocator.holdingRegisterBit(slaveId, 1, 5));
				batchRead.addLocator("40016-6", BaseLocator.holdingRegisterBit(slaveId, 1, 6));
				batchRead.addLocator("40016-7", BaseLocator.holdingRegisterBit(slaveId, 1, 7));
				batchRead.addLocator("40016-8", BaseLocator.holdingRegisterBit(slaveId, 1, 8));
				batchRead.addLocator("40016-9", BaseLocator.holdingRegisterBit(slaveId, 1, 9));
				batchRead.addLocator("40016-a", BaseLocator.holdingRegisterBit(slaveId, 1, 10));
				batchRead.addLocator("40016-b", BaseLocator.holdingRegisterBit(slaveId, 1, 11));
				batchRead.addLocator("40016-c", BaseLocator.holdingRegisterBit(slaveId, 1, 12));
				batchRead.addLocator("40016-d", BaseLocator.holdingRegisterBit(slaveId, 1, 13));
				batchRead.addLocator("40016-e", BaseLocator.holdingRegisterBit(slaveId, 1, 14));
				batchRead.addLocator("40016-f", BaseLocator.holdingRegisterBit(slaveId, 1, 15));
				//
				// batchRead.addLocator("30016-0 sb true",
				// BaseLocator.inputRegisterBit(slaveId, 30016, 0));
				// batchRead.addLocator("30016-1 sb false",
				// BaseLocator.inputRegisterBit(slaveId, 30016, 1));
				// batchRead.addLocator("30016-2 sb false",
				// BaseLocator.inputRegisterBit(slaveId, 30016, 2));
				// batchRead.addLocator("30016-3 sb false",
				// BaseLocator.inputRegisterBit(slaveId, 30016, 3));
				// batchRead.addLocator("30016-4 sb false",
				// BaseLocator.inputRegisterBit(slaveId, 30016, 4));
				// batchRead.addLocator("30016-5 sb false",
				// BaseLocator.inputRegisterBit(slaveId, 30016, 5));
				// batchRead.addLocator("30016-6 sb false",
				// BaseLocator.inputRegisterBit(slaveId, 30016, 6));
				// batchRead.addLocator("30016-7 sb true",
				// BaseLocator.inputRegisterBit(slaveId, 30016, 7));
				// batchRead.addLocator("30016-8 sb true",
				// BaseLocator.inputRegisterBit(slaveId, 30016, 8));
				// batchRead.addLocator("30016-9 sb false",
				// BaseLocator.inputRegisterBit(slaveId, 30016, 9));
				// batchRead.addLocator("30016-a sb false",
				// BaseLocator.inputRegisterBit(slaveId, 30016, 10));
				// batchRead.addLocator("30016-b sb false",
				// BaseLocator.inputRegisterBit(slaveId, 30016, 11));
				// batchRead.addLocator("30016-c sb false",
				// BaseLocator.inputRegisterBit(slaveId, 30016, 12));
				// batchRead.addLocator("30016-d sb false",
				// BaseLocator.inputRegisterBit(slaveId, 30016, 13));
				// batchRead.addLocator("30016-e sb false",
				// BaseLocator.inputRegisterBit(slaveId, 30016, 14));
				// batchRead.addLocator("30016-f sb true",
				// BaseLocator.inputRegisterBit(slaveId, 30016, 15));

				batchRead.addLocator("40017", BaseLocator.holdingRegister(slaveId, 17, DataType.TWO_BYTE_INT_UNSIGNED));
				batchRead.addLocator("40018", BaseLocator.holdingRegister(slaveId, 18, DataType.FOUR_BYTE_INT_SIGNED));
				batchRead.addLocator("40019", BaseLocator.holdingRegister(slaveId, 19, DataType.FOUR_BYTE_INT_SIGNED));
				batchRead.addLocator("40020", BaseLocator.holdingRegister(slaveId, 20, DataType.FOUR_BYTE_INT_SIGNED));
				batchRead.addLocator("40021", BaseLocator.holdingRegister(slaveId, 21, DataType.FOUR_BYTE_INT_SIGNED));
				batchRead.addLocator("40022", BaseLocator.holdingRegister(slaveId, 39, DataType.FOUR_BYTE_INT_SIGNED));
				//
				// batchRead.addLocator("30017 sb -1968 tc",
				// BaseLocator.inputRegister(slaveId, 30017,
				// DataType.TWO_BYTE_INT_UNSIGNED));
				// batchRead.addLocator("30018 sb -123456789 tc",
				// BaseLocator.inputRegister(slaveId, 30018,
				// DataType.FOUR_BYTE_INT_UNSIGNED));
				// batchRead.addLocator("30020 sb -123456789 tc",
				// BaseLocator.inputRegister(slaveId, 30020,
				// DataType.FOUR_BYTE_INT_UNSIGNED_SWAPPED));
				// batchRead.addLocator("30022 sb 1968.1968",
				// BaseLocator.inputRegister(slaveId, 30022,
				// DataType.FOUR_BYTE_FLOAT_SWAPPED));
				// batchRead.addLocator("30024 sb -123456789 tc",
				// BaseLocator.inputRegister(slaveId, 30024,
				// DataType.EIGHT_BYTE_INT_UNSIGNED));
				// batchRead.addLocator("30028 sb -123456789 tc",
				// BaseLocator.inputRegister(slaveId, 30028,
				// DataType.EIGHT_BYTE_INT_UNSIGNED_SWAPPED));
				// batchRead.addLocator("30032 sb 1968.1968",
				// BaseLocator.inputRegister(slaveId, 30032,
				// DataType.EIGHT_BYTE_FLOAT_SWAPPED));

				MultiSlaveBatchResults results = master.send(batchRead);

				System.out.println(JSON.toJSONString(results));
				TimeUnit.SECONDS.sleep(2);
			}
		} finally {
			master.destroy();
		}
	}
}
