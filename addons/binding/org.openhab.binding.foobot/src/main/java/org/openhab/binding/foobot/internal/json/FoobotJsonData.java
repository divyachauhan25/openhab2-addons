/**
 * Copyright (c) 2010-2018 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.foobot.internal.json;

import java.util.ArrayList;
import java.util.List;

/**
 * The {@link FoobotJsonData} is responsible for storing
 * the "datapoints" from the foobot.io JSON response
 *
 * @author Divya Chauhan - Initial contribution
 */
public class FoobotJsonData {

    private String uuid;
    private long start;
    private long end;
    private List<String> sensors;
    private List<String> units;
    private List<List<String>> datapoints;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public long getStart() {
        return start;
    }

    public void setStart(long start) {
        this.start = start;
    }

    public long getEnd() {
        return end;
    }

    public void setEnd(long end) {
        this.end = end;
    }

    public List<String> getSensors() {
        return sensors;
    }

    public void setSensors(ArrayList<String> sensors) {
        this.sensors = sensors;
    }

    public List<String> getUnits() {
        return units;
    }

    public void setUnits(ArrayList<String> units) {
        this.units = units;
    }

    public List<List<String>> getDatapoints() {
        return datapoints;
    }

    public void setDatapoints(List<List<String>> datapoints) {
        this.datapoints = datapoints;
    }
}
