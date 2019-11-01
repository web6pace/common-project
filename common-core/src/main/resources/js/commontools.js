/**
 * 判断某字符串是否以某字符串结尾
 * @param s
 * @returns {boolean}
 */
String.prototype.endWith = function (s) {
    if (s == null || s == "" || this.length == 0 || s.length > this.length)
        return false;
    return this.substring(this.length - s.length) == s;
};

/**
 * js 判断是否以某字符串开始
 * @param s
 * @returns {boolean}
 */
String.prototype.startWith = function (s) {
    if (s == null || s == "" || this.length == 0 || s.length > this.length)
        return false;
    return this.substr(0, s.length) == s;
};

function startWith(orStr, withs) {
    if (withs == null || withs == "" || orStr == "" || orStr.length == 0 || withs.length > orStr.length)
        return false;
    return orStr.substr(0, withs.length) == withs;
}



/**
 * 判断该对你是否为空
 * @param obj
 * @returns {boolean}
 */
function isEmpty(obj) {
    if (typeof(obj) === "undefined") {
        return true;
    }
    if (obj === "undefined") {
        return true;
    }
    if (obj === "") {
        return true;
    }
    if (!obj && obj !== 0 && obj !== '' && obj == null) {
        return true;
    }
    if (Array.prototype.isPrototypeOf(obj) && obj.length === 0) {
        return true;
    }
    return Object.prototype.isPrototypeOf(obj) && Object.keys(obj).length === 0;
}

/**
 * 数组去重
 * @author xiachunqiu
 * @since 2018/7/31 16:39
 */
Array.prototype.unique = function () {
    var res = [];
    var json = {};
    for (var i = 0; i < this.length; i++) {
        if (!json[this[i]]) {
            res.push(this[i]);
            json[this[i]] = 1;
        }
    }
    return res;
};

/**
 * 数组根据值移除项
 * @author xiachunqiu
 * @since 2018/7/31 16:39
 */
Array.prototype.removeByValue = function (arr, val) {
    if (typeof(arr) != "undefined") {
        for (var i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                arr.splice(i, 1);
            }
        }
    }
    return arr;
};

