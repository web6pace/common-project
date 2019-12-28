package com.yz.common.core.utils.DateCommon;
/**
 * @Description:
 * @Created with IntelliJ IDEA.
 * @User: conglj
 * @Date: 2019/11/1  18:16
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName WeekDayUtil
 * @Description TODO
 * @Author cong
 * @Date 2019/11/1 18:16
 **/
public class WeekDayUtil {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        getDates("2019-11-01", "2019-11-30", "星期一|星期二|星期日");
        List<String> weekDays = new LinkedList<>();
        weekDays.add("mon");
        weekDays.add("sun");
        getDates(sdf.parse("2019-11-01"), sdf.parse("2019-11-30"), weekDays);
    }

    /**
     * @Description:获取某一时间段特定星期几的日期
     * @author conglj
     * @Date: 2019/11/1 18:56
     * @methodName getDates
     * @param dateFrom  开始时间
     * @param dateEnd  结束时间
     * @param weekDays  ['mon','sun']
     * @returns java.lang.String[]
     */
    public static String[] getDates(Date dateFrom, Date dateEnd, List<String> weekDays) {

        long time = 1L;
        long perDayMilSec = 24 * 60 * 60 * 1000;
        List<String> dateList = new ArrayList<String>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //需要查询的星期系数
        String strWeekNumber = weekForNum(weekDays);
        try {
            String dateFromStr = sdf.format(dateFrom.getTime() - perDayMilSec);
            while (true) {
                time = sdf.parse(dateFromStr).getTime();
                time = time + perDayMilSec;
                Date date = new Date(time);
                dateFromStr = sdf.format(date);
                String dateEndStr = sdf.format(dateEnd);
                if (dateFromStr.compareTo(dateEndStr) <= 0) {
//查询的某一时间的星期系数
                    Integer weekDay = dayForWeek(date);
//判断当期日期的星期系数是否是需要查询的
                    if (strWeekNumber.indexOf(weekDay.toString()) != -1) {
                        System.out.println(dateFromStr);
                        dateList.add(dateFromStr);
                    }
                } else {
                    break;
                }
            }
        } catch (ParseException e1) {
            e1.printStackTrace();
        }
        String[] dateArray = new String[dateList.size()];
        dateList.toArray(dateArray);
        return dateArray;
    }
    /**
     * 获取某一时间段特定星期几的日期
     *
     * @param dateFrom 开始时间
     * @param dateEnd  结束时间
     * @param weekDays 星期
     * @return 返回时间数组
     */
    public static String[] getDates(String dateFrom, String dateEnd, String weekDays) {
        long time = 1L;
        long perDayMilSec = 24 * 60 * 60 * 1000;
        List<String> dateList = new ArrayList<String>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //需要查询的星期系数
        String strWeekNumber = weekForNum(weekDays);
        try {
            dateFrom = sdf.format(sdf.parse(dateFrom).getTime() - perDayMilSec);
            while (true) {
                time = sdf.parse(dateFrom).getTime();
                time = time + perDayMilSec;
                Date date = new Date(time);
                dateFrom = sdf.format(date);
                if (dateFrom.compareTo(dateEnd) <= 0) {
//查询的某一时间的星期系数
                    Integer weekDay = dayForWeek(date);
//判断当期日期的星期系数是否是需要查询的
                    if (strWeekNumber.indexOf(weekDay.toString()) != -1) {
                        System.out.println(dateFrom);
                        dateList.add(dateFrom);
                    }
                } else {
                    break;
                }
            }
        } catch (ParseException e1) {
            e1.printStackTrace();
        }
        String[] dateArray = new String[dateList.size()];
        dateList.toArray(dateArray);
        return dateArray;
    }

    //等到当期时间的周系数。星期日：1，星期一：2，星期二：3，星期三：4，星期四：5，星期五：6，星期六：7


    public static Integer dayForWeek(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.DAY_OF_WEEK);
    }

    /**
     * 得到对应星期的系数   星期日：1，星期一：2，星期二：3，星期三：4，星期四：5，星期五：6，星期六：7
     *
     * @param weekDays 星期格式   星期一|星期二
     */


    public static String weekForNum(String weekDays) {
        //返回结果为组合的星期系数
        String weekNumber = "";
        //解析传入的星期
        if (weekDays.indexOf("|") != -1) {//多个星期数
            String[] strWeeks = weekDays.split("\\|");
            for (int i = 0; i < strWeeks.length; i++) {
                weekNumber = weekNumber + "" + getWeekNum(strWeeks[i]).toString();
            }
        } else {//一个星期数
            weekNumber = getWeekNum(weekDays).toString();
        }

        return weekNumber;

    }
    public static String weekForNum(List<String> weekDays) {
        //返回结果为组合的星期系数
        String weekNumber = "";
        //解析传入的星期
        if (!weekDays.isEmpty()) {//多个星期数
            for (String week :weekDays) {
                weekNumber = weekNumber + "" + getWeekEnNum(week).toString();
            }
        }
        return weekNumber;

    }
    //将星期转换为对应的系数   星期日：1，星期一：2，星期二：3，星期三：4，星期四：5，星期五：6，星期六：7


    public static Integer getWeekNum(String strWeek) {
        Integer number = 1;//默认为星期日
        if ("星期日".equals(strWeek)) {
            number = 1;
        } else if ("星期一".equals(strWeek)) {
            number = 2;
        } else if ("星期二".equals(strWeek)) {
            number = 3;
        } else if ("星期三".equals(strWeek)) {
            number = 4;
        } else if ("星期四".equals(strWeek)) {
            number = 5;
        } else if ("星期五".equals(strWeek)) {
            number = 6;
        } else if ("星期六".equals(strWeek)) {
            number = 7;
        } else {
            number = 1;
        }
        return number;
    }

//    {name: '周一', value: 'mon'},
//    {name: '周二', value: 'tue'},
//    {name: '周三', value: 'wed'},
//    {name: '周四', value: 'thu'},
//    {name: '周五', value: 'fri'},
//    {name: '周六', value: 'sat'},
//    {name: '周天', value: 'sun'}

    public static Integer getWeekEnNum(String strWeek) {
        Integer number = 1;//默认为星期日
        if ("sun".equals(strWeek)) {
            number = 1;
        } else if ("mon".equals(strWeek)) {
            number = 2;
        } else if ("tue".equals(strWeek)) {
            number = 3;
        } else if ("wed".equals(strWeek)) {
            number = 4;
        } else if ("thu".equals(strWeek)) {
            number = 5;
        } else if ("fri".equals(strWeek)) {
            number = 6;
        } else if ("sat".equals(strWeek)) {
            number = 7;
        } else {
            number = 1;
        }
        return number;
    }
}
