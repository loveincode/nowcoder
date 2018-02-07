package leetcode.穷举;

import common.Point;

/**
 * Definition for a point.
 * class Point {
 *     int x;
 *     int y;
 *     Point() { x = 0; y = 0; }
 *     Point(int a, int b) { x = a; y = b; }
 * }
 */
public class Max_Points_On_A_Line {
	
	/*
	 * Given n points on a 2D plane, 
	 * 在一个给定的n个点的平面，
	 * find the maximum number of points that lie on the same straight line.
	 * 找到最大数个百分点，躺在相同的直线。
	 */
	public int maxPoints(Point[] points) {
		// 关键在于判断三点共线，两平行直线有且只有一个交点，所以有一个中间点，这个中间点与另外两个端点的连线的斜率相等
		// 由比率的性质
		int ABx;
		int ABy;
		int BCx;
		int BCy;

		if (points.length <= 2)
			return points.length;
		int max = 2;// 用来记录最大个数

		for (int i = 0; i < points.length; i++) {
			int num = 0;
			int temp = 1;

			for (int j = i + 1; j < points.length; j++) {
				ABx = points[i].x - points[j].x;
				ABy = points[i].y - points[j].y;
				if (ABx == 0 && ABy == 0)// 表示出现重复点
				{
					num++;
				} else {
					temp++;
					for (int k = j + 1; k < points.length; k++) {
						BCx = points[j].x - points[k].x;
						BCy = points[j].y - points[k].y;
						if (ABx * BCy == BCx * ABy) {// 表示两个斜率相等，转化为乘积的形式可以避免分母为0的情况
							temp++;
						}
					}
				}
				if (max < (num + temp)) {
					max = num + temp;
				}
				temp = 1;
			}

		}
		return max;
	}
}
