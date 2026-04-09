/**
 * @param {Object|Array} obj
 * @return {Object|Array}
 */
var compactObject = function(obj) {
    if (Array.isArray(obj)) {
        let result = [];

        for (let el of obj) {
            if (Boolean(el)) {
                let compacted = compactObject(el);
                result.push(compacted);
            }
        }

        return result;
    }

    // if object
    else if (typeof obj === "object" && obj !== null) {
        let result = {};

        for (let key in obj) {
            if (Boolean(obj[key])) {
                let compacted = compactObject(obj[key]);
                result[key] = compacted;
            }
        }

        return result;
    }

    // if primitive
    return obj;
};