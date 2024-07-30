package com.cat.fishmall.leet;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @Author: xaa
 * @Date: 2024/6/11
 * @Version: V1.0
 * @Description:
 **/
public class TimeCost {

	private TimeUnit timeUnit;

	private List<Record> records = new ArrayList<>();

	public TimeCost(TimeUnit timeUnit) {
		this.timeUnit = timeUnit;
	}

	public TimeCost() {
		this.timeUnit = TimeUnit.SECONDS;
	}

	public void start(String task){
		long now = System.currentTimeMillis();
		if (!records.isEmpty()) {
			Record record = records.get(records.size() - 1);
			record.setTaskEnd(now);
		}
		Record record = new Record();
		record.setTask(task);
		record.setTaskBegin(now);
		records.add(record);
	}

	public void prettyPrint(){
		long now = System.currentTimeMillis();
		if (!records.isEmpty()) {
			Record record = records.get(records.size() - 1);
			record.setTaskEnd(now);
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < records.size(); i++) {
			Record record = records.get(i);
			sb.append(record.getTask());
			sb.append(": ");
			sb.append(TimeUnit.MICROSECONDS.convert(record.getTaskEnd() - record.getTaskBegin(), timeUnit));
			sb.append(" ");
			sb.append(timeUnit.name());
			sb.append("\n");
		}
		System.out.println(sb);
	}

	@Data
	private class Record{
		private String task;
		private Long taskBegin;
		private Long taskEnd;
	}

}
