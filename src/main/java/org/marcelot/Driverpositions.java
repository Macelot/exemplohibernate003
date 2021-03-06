package org.marcelot;
// Generated 14/09/2020 21:28:42 by Hibernate Tools 5.4.18.Final

import java.math.BigDecimal;
import java.util.Date;

/**
 * Driverpositions generated by hbm2java
 */
public class Driverpositions implements java.io.Serializable {

	private Integer id;
	private String idRoute;
	private BigDecimal lat;
	private BigDecimal lng;
	private Float accuracy;
	private Integer routeId;
	private Date dateTime;
	private String status;
	private Date created;
	private Date modified;

	public Driverpositions() {
	}

	public Driverpositions(BigDecimal lat, BigDecimal lng) {
		this.lat = lat;
		this.lng = lng;
	}

	public Driverpositions(String idRoute, BigDecimal lat, BigDecimal lng, Float accuracy, Integer routeId,
			Date dateTime, String status, Date created, Date modified) {
		this.idRoute = idRoute;
		this.lat = lat;
		this.lng = lng;
		this.accuracy = accuracy;
		this.routeId = routeId;
		this.dateTime = dateTime;
		this.status = status;
		this.created = created;
		this.modified = modified;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIdRoute() {
		return this.idRoute;
	}

	public void setIdRoute(String idRoute) {
		this.idRoute = idRoute;
	}

	public BigDecimal getLat() {
		return this.lat;
	}

	public void setLat(BigDecimal lat) {
		this.lat = lat;
	}

	public BigDecimal getLng() {
		return this.lng;
	}

	public void setLng(BigDecimal lng) {
		this.lng = lng;
	}

	public Float getAccuracy() {
		return this.accuracy;
	}

	public void setAccuracy(Float accuracy) {
		this.accuracy = accuracy;
	}

	public Integer getRouteId() {
		return this.routeId;
	}

	public void setRouteId(Integer routeId) {
		this.routeId = routeId;
	}

	public Date getDateTime() {
		return this.dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
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
