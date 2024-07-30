package com.cat.fishmall.leet;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * @Author: xaa
 * @Date: 2024/6/11
 * @Version: V1.0
 * @Description:
 **/
@Slf4j
public class MovingAverage {

	private int size;

	private List<Integer> list;

	private LinkedList<Integer> linkedList;

	private double sum = 0;

	public MovingAverage(int size) {
		this.size = size;
		list = new ArrayList<>(size);
		linkedList = new LinkedList<>();
	}

	public void nextLinked(int val) {
		linkedList.push(val);
		if (linkedList.size() > size) {
			linkedList.pop();
		}
		double sum = 0;
		for (Integer i : list) {
			sum += i;
		}
		//System.out.println(sum / list.size());
	}

	public void next(int val) {
		list.add(val);
		if (list.size() > size) {
			list.remove(0);
		}
		double sum = 0;
		for (Integer i : list) {
			sum += i;
		}
		//System.out.println(sum / list.size());
	}

	public void nextSum(int val) {
		list.add(val);
		sum += val;
		if (list.size() > size) {
			sum -= list.remove(0);
		}
		//System.out.println(sum / list.size());
	}

	public static void main(String[] args) {
		log.info("开始");
		int count = 100000;
		int size = 100;
		List<Integer> numList = new ArrayList<>(count);
		Random random = new Random();
		for (int i = 0; i < count; i++) {
			numList.add(random.nextInt());
		}
		TimeCost timeCost = new TimeCost(TimeUnit.MICROSECONDS);
		timeCost.start("每次算全部");
		MovingAverage movingAverage = new MovingAverage(size);
		for (int i = 0; i < count; i++) {
			movingAverage.next(numList.get(i));
		}
		timeCost.start("每次算全部 linked");
		MovingAverage movingAverage3 = new MovingAverage(size);
		for (int i = 0; i < count; i++) {
			movingAverage3.nextLinked(numList.get(i));
		}
		timeCost.start("累加");
		MovingAverage movingAverage2 = new MovingAverage(size);
		for (int i = 0; i < count; i++) {
			movingAverage2.nextSum(numList.get(i));
		}
		timeCost.prettyPrint();
		log.info("结束");
	}

}
