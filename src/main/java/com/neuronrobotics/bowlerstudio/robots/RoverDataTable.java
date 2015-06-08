package com.neuronrobotics.bowlerstudio.robots;

import java.util.ArrayList;

import com.neuronrobotics.sdk.common.NonBowlerDevice;

public class RoverDataTable extends NonBowlerDevice {
	
	private ArrayList<ObjectDetectionDataTableElement> detections = new ArrayList<>();

	@Override
	public void disconnectDeviceImp() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean connectDeviceImp() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<String> getNamespacesImp() {
		// TODO Auto-generated method stub
		return new ArrayList<String>();
	}

	public ArrayList<ObjectDetectionDataTableElement> getDetections() {
		return detections;
	}
	
	public void addDetector(ObjectDetectionDataTableElement el){
		if(!detections.contains(el))
			detections.add(el);
	}

	public ObjectDetectionDataTableElement getSpecificDetection(String name ) {
		for (ObjectDetectionDataTableElement o:detections){
			if(o.getName().contains(name)){
				return o;
			}
		}
		return null;
	}

}
