package com.ims.mvvmbelajar1;

import com.google.gson.annotations.SerializedName;

public class Corona{

	@SerializedName("attributes")
	private Attributes attributes;

	public void setAttributes(Attributes attributes){
		this.attributes = attributes;
	}

	public Attributes getAttributes(){
		return attributes;
	}

	public static class Attributes{

		@SerializedName("FID")
		private int fID;

		@SerializedName("Kode_Provi")
		private int kodeProvi;

		@SerializedName("Kasus_Meni")
		private String meninggal;

		@SerializedName("Kasus_Posi")
		private String positif;

		@SerializedName("Provinsi")
		private String provinsi;

		@SerializedName("Kasus_Semb")
		private String sembuh;

		public int getfID() {
			return fID;
		}

		public void setfID(int fID) {
			this.fID = fID;
		}

		public int getKodeProvi() {
			return kodeProvi;
		}

		public void setKodeProvi(int kodeProvi) {
			this.kodeProvi = kodeProvi;
		}

		public String getMeninggal() {
			return meninggal;
		}

		public void setMeninggal(String meninggal) {
			this.meninggal = meninggal;
		}

		public String getPositif() {
			return positif;
		}

		public void setPositif(String positif) {
			this.positif = positif;
		}

		public String getProvinsi() {
			return provinsi;
		}

		public void setProvinsi(String provinsi) {
			this.provinsi = provinsi;
		}

		public String getSembuh() {
			return sembuh;
		}

		public void setSembuh(String sembuh) {
			this.sembuh = sembuh;
		}
	}
}