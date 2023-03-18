/**
 * @author abhit - aryan9
 * CIS175 - Spring 2023
 * Mar 17, 2023
 */
package dmacc.beans;

import jakarta.persistence.Embeddable;

@Embeddable
public class Details {
	
	private String gpu;
	private String cpu;
	private String storage;
	
	public Details() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public Details(String gpu, String cpu, String storage) {
		super();
		this.gpu = gpu;
		this.cpu = cpu;
		this.storage = storage;
	}

	/**
	 * @return the gpu
	 */
	public String getGpu() {
		return gpu;
	}

	/**
	 * @param gpu the gpu to set
	 */
	public void setGpu(String gpu) {
		this.gpu = gpu;
	}

	/**
	 * @return the cpu
	 */
	public String getCpu() {
		return cpu;
	}

	/**
	 * @param cpu the cpu to set
	 */
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	/**
	 * @return the storage
	 */
	public String getStorage() {
		return storage;
	}

	/**
	 * @param storage the storage to set
	 */
	public void setStorage(String storage) {
		this.storage = storage;
	}
	
	@Override
	public String toString() {
		return "Details [gpu = " + gpu + ", cpu = " + cpu + ", storage = " + storage + "]";
	}
}
