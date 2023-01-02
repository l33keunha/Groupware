/**
 * 
 */

/**
 		ajax  
 */
function callService(o) {
    $.ajax({

        type: "POST",
        url: o.url,
        data: o.param,
        dataType: "json",
        cache: false,
        async: o.async == undefined ? true : o.async,
        success: o.callback,
        error: o.errCallback
    });
}

function errCallback(){
	console.log("ajax 실패");
};