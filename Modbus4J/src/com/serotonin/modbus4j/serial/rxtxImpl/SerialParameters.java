package com.serotonin.modbus4j.serial.rxtxImpl;

import gnu.io.SerialPort;

/**
 * @author Matthew Lohbihler
 *
 */
public class SerialParameters {
	private String commPortId;
	private int baudRate;
	private int flowControlIn;
	private int flowControlOut;
	private int dataBits;
	private int stopBits;
	private int parity;

	public SerialParameters(String commPortId) {
		this(commPortId, 9600);
	}

	public SerialParameters(String commportId, int baudRate) {
		this(commportId, baudRate, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
	}

	public SerialParameters(String commPortId, int baudRate, int dataBits, int stopBits, int parity) {
		this(commPortId, baudRate, dataBits, stopBits, parity, SerialPort.FLOWCONTROL_NONE,
				SerialPort.FLOWCONTROL_NONE);
	}

	public SerialParameters(String commPortId, int baudRate, int dataBits, int stopBits, int parity, int flowControlIn,
			int flowControlOut) {
		this.commPortId = commPortId;
		this.baudRate = baudRate;
		this.dataBits = dataBits;
		this.stopBits = stopBits;
		this.parity = parity;
		this.flowControlIn = flowControlIn;
		this.flowControlOut = flowControlOut;
	}

	public int getBaudRate() {
		return baudRate;
	}

	public void setBaudRate(int baudRate) {
		this.baudRate = baudRate;
	}

	public String getCommPortId() {
		return commPortId;
	}

	public void setCommPortId(String commPortId) {
		this.commPortId = commPortId;
	}

	public int getDataBits() {
		return dataBits;
	}

	public void setDataBits(int dataBits) {
		this.dataBits = dataBits;
	}

	public int getFlowControlIn() {
		return flowControlIn;
	}

	public void setFlowControlIn(int flowControlIn) {
		this.flowControlIn = flowControlIn;
	}

	public int getFlowControlOut() {
		return flowControlOut;
	}

	public void setFlowControlOut(int flowControlOut) {
		this.flowControlOut = flowControlOut;
	}

	public int getParity() {
		return parity;
	}

	public void setParity(int parity) {
		this.parity = parity;
	}

	public int getStopBits() {
		return stopBits;
	}

	public void setStopBits(int stopBits) {
		this.stopBits = stopBits;
	}
}
