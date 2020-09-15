package org.marcelot;
// Generated 14/09/2020 21:28:42 by Hibernate Tools 5.4.18.Final

import java.math.BigDecimal;
import java.util.Date;

/**
 * Companies generated by hbm2java
 */
public class Companies implements java.io.Serializable {

	private Integer id;
	private Integer version;
	private String company;
	private String street;
	private String number;
	private String district;
	private String city;
	private String uf;
	private String cep;
	private String keymaps;
	private String travelStyle;
	private String dateDefaultTimezoneSet;
	private String testOptimize;
	private BigDecimal latxy;
	private BigDecimal lngXy;
	private String unidade;
	private Integer raio;
	private Date timeAdmGo;
	private Date timeAdmBack;
	private Float vehicleLength;
	private Float vehicleWidth;
	private Float vehicleHeight;
	private String travelMode;
	private Integer vehicleWeight;
	private String arriveAt;
	private String departAt;
	private String routeType;
	private String avoid;
	private String vehicleMaxSpeed;
	private String vehicleLoadType;
	private String cores;
	private BigDecimal lati;
	private BigDecimal longi;
	private String description;
	private String phone;
	private String email;
	private String cnpj;
	private Integer userId;
	private String status;
	private Date lockedTime;
	private Integer lockedBy;
	private String lockedSession;
	private Date created;
	private Date modified;

	public Companies() {
	}

	public Companies(BigDecimal latxy, BigDecimal lngXy, BigDecimal lati, BigDecimal longi) {
		this.latxy = latxy;
		this.lngXy = lngXy;
		this.lati = lati;
		this.longi = longi;
	}

	public Companies(String company, String street, String number, String district, String city, String uf, String cep,
			String keymaps, String travelStyle, String dateDefaultTimezoneSet, String testOptimize, BigDecimal latxy,
			BigDecimal lngXy, String unidade, Integer raio, Date timeAdmGo, Date timeAdmBack, Float vehicleLength,
			Float vehicleWidth, Float vehicleHeight, String travelMode, Integer vehicleWeight, String arriveAt,
			String departAt, String routeType, String avoid, String vehicleMaxSpeed, String vehicleLoadType,
			String cores, BigDecimal lati, BigDecimal longi, String description, String phone, String email,
			String cnpj, Integer userId, String status, Date lockedTime, Integer lockedBy, String lockedSession,
			Date created, Date modified) {
		this.company = company;
		this.street = street;
		this.number = number;
		this.district = district;
		this.city = city;
		this.uf = uf;
		this.cep = cep;
		this.keymaps = keymaps;
		this.travelStyle = travelStyle;
		this.dateDefaultTimezoneSet = dateDefaultTimezoneSet;
		this.testOptimize = testOptimize;
		this.latxy = latxy;
		this.lngXy = lngXy;
		this.unidade = unidade;
		this.raio = raio;
		this.timeAdmGo = timeAdmGo;
		this.timeAdmBack = timeAdmBack;
		this.vehicleLength = vehicleLength;
		this.vehicleWidth = vehicleWidth;
		this.vehicleHeight = vehicleHeight;
		this.travelMode = travelMode;
		this.vehicleWeight = vehicleWeight;
		this.arriveAt = arriveAt;
		this.departAt = departAt;
		this.routeType = routeType;
		this.avoid = avoid;
		this.vehicleMaxSpeed = vehicleMaxSpeed;
		this.vehicleLoadType = vehicleLoadType;
		this.cores = cores;
		this.lati = lati;
		this.longi = longi;
		this.description = description;
		this.phone = phone;
		this.email = email;
		this.cnpj = cnpj;
		this.userId = userId;
		this.status = status;
		this.lockedTime = lockedTime;
		this.lockedBy = lockedBy;
		this.lockedSession = lockedSession;
		this.created = created;
		this.modified = modified;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDistrict() {
		return this.district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getUf() {
		return this.uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCep() {
		return this.cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getKeymaps() {
		return this.keymaps;
	}

	public void setKeymaps(String keymaps) {
		this.keymaps = keymaps;
	}

	public String getTravelStyle() {
		return this.travelStyle;
	}

	public void setTravelStyle(String travelStyle) {
		this.travelStyle = travelStyle;
	}

	public String getDateDefaultTimezoneSet() {
		return this.dateDefaultTimezoneSet;
	}

	public void setDateDefaultTimezoneSet(String dateDefaultTimezoneSet) {
		this.dateDefaultTimezoneSet = dateDefaultTimezoneSet;
	}

	public String getTestOptimize() {
		return this.testOptimize;
	}

	public void setTestOptimize(String testOptimize) {
		this.testOptimize = testOptimize;
	}

	public BigDecimal getLatxy() {
		return this.latxy;
	}

	public void setLatxy(BigDecimal latxy) {
		this.latxy = latxy;
	}

	public BigDecimal getLngXy() {
		return this.lngXy;
	}

	public void setLngXy(BigDecimal lngXy) {
		this.lngXy = lngXy;
	}

	public String getUnidade() {
		return this.unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public Integer getRaio() {
		return this.raio;
	}

	public void setRaio(Integer raio) {
		this.raio = raio;
	}

	public Date getTimeAdmGo() {
		return this.timeAdmGo;
	}

	public void setTimeAdmGo(Date timeAdmGo) {
		this.timeAdmGo = timeAdmGo;
	}

	public Date getTimeAdmBack() {
		return this.timeAdmBack;
	}

	public void setTimeAdmBack(Date timeAdmBack) {
		this.timeAdmBack = timeAdmBack;
	}

	public Float getVehicleLength() {
		return this.vehicleLength;
	}

	public void setVehicleLength(Float vehicleLength) {
		this.vehicleLength = vehicleLength;
	}

	public Float getVehicleWidth() {
		return this.vehicleWidth;
	}

	public void setVehicleWidth(Float vehicleWidth) {
		this.vehicleWidth = vehicleWidth;
	}

	public Float getVehicleHeight() {
		return this.vehicleHeight;
	}

	public void setVehicleHeight(Float vehicleHeight) {
		this.vehicleHeight = vehicleHeight;
	}

	public String getTravelMode() {
		return this.travelMode;
	}

	public void setTravelMode(String travelMode) {
		this.travelMode = travelMode;
	}

	public Integer getVehicleWeight() {
		return this.vehicleWeight;
	}

	public void setVehicleWeight(Integer vehicleWeight) {
		this.vehicleWeight = vehicleWeight;
	}

	public String getArriveAt() {
		return this.arriveAt;
	}

	public void setArriveAt(String arriveAt) {
		this.arriveAt = arriveAt;
	}

	public String getDepartAt() {
		return this.departAt;
	}

	public void setDepartAt(String departAt) {
		this.departAt = departAt;
	}

	public String getRouteType() {
		return this.routeType;
	}

	public void setRouteType(String routeType) {
		this.routeType = routeType;
	}

	public String getAvoid() {
		return this.avoid;
	}

	public void setAvoid(String avoid) {
		this.avoid = avoid;
	}

	public String getVehicleMaxSpeed() {
		return this.vehicleMaxSpeed;
	}

	public void setVehicleMaxSpeed(String vehicleMaxSpeed) {
		this.vehicleMaxSpeed = vehicleMaxSpeed;
	}

	public String getVehicleLoadType() {
		return this.vehicleLoadType;
	}

	public void setVehicleLoadType(String vehicleLoadType) {
		this.vehicleLoadType = vehicleLoadType;
	}

	public String getCores() {
		return this.cores;
	}

	public void setCores(String cores) {
		this.cores = cores;
	}

	public BigDecimal getLati() {
		return this.lati;
	}

	public void setLati(BigDecimal lati) {
		this.lati = lati;
	}

	public BigDecimal getLongi() {
		return this.longi;
	}

	public void setLongi(BigDecimal longi) {
		this.longi = longi;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCnpj() {
		return this.cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getLockedTime() {
		return this.lockedTime;
	}

	public void setLockedTime(Date lockedTime) {
		this.lockedTime = lockedTime;
	}

	public Integer getLockedBy() {
		return this.lockedBy;
	}

	public void setLockedBy(Integer lockedBy) {
		this.lockedBy = lockedBy;
	}

	public String getLockedSession() {
		return this.lockedSession;
	}

	public void setLockedSession(String lockedSession) {
		this.lockedSession = lockedSession;
	}

	public Date getCreated() {
		return this.created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getModified() {
		return this.modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}

}