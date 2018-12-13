
function demoKnob() {
    // Create knob element, 300 x 300 px in size.
    var knob = pureknob.createKnob(400, 400);

    // Set properties.
    knob.setProperty('angleStart', -1 * Math.PI);
    knob.setProperty('angleEnd', 1 * Math.PI);
    knob.setProperty('colorFG', '#88ff88');
    knob.setProperty('trackWidth', 0.4);
    knob.setProperty('valMin', 0);
    knob.setProperty('valMax', 20000);


    // Set initial value.
    knob.setValue(0);



    /*
     * Event listener.
     *
     * Parameter 'knob' is the knob object which was
     * actuated. Allows you to associate data with
     * it to discern which of your knobs was actuated.
     *
     * Parameter 'value' is the value which was set
     * by the user.
     */

    var listener = function(knob, value) {
        console.log(value); //log current value in browser console
        oscillator.frequency.setValueAtTime(value, audioCtx.currentTime); //update listener with new value

    };

    knob.addListener(listener);

    // Create element node.
    var node = knob.node();

    // Add it to the DOM.
    var elem = document.getElementById('knob1');
    elem.appendChild(node);
}


/*
 * This is executed after the document finished loading.
 */
function ready() {
    demoKnob();

}

document.addEventListener('DOMContentLoaded', ready, false);
