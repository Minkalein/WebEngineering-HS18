<!doctype html>
<html>
<head>
    <title>Multiplication Circle</title>
    <style>
    circle, line {

        stroke: rgba(255, 0, 0, 0.3);
        stroke-width: 3px;
    }

    circle{
        fill: transparent;
    }

    label {
        display: block;
        float: left;
        width: 5em;
    }
    </style>
    <script>
        function increase(valueName) {
            var input = document.getElementById(valueName);
            input.value = parseInt(input.value) + 1;
        }


//zählt eins Minus = jedes mal eine Linie weniger
        function decrease(valueName) {
            var input = document.getElementById(valueName);
            input.value = parseInt(input.value) - 1;
        }

    </script>
</head>

<body bgcolor ="black">
<form action="/multiplicationCircle/index">
    <tmpl:up_down_input name="segmentCount" label="Segments" value="${circleInstance.segmentCount}"/>

    <!-- TODO: add an input for the table base -->
    <tmpl:up_down_input name="tableBase" label="Table Base" value="${circleInstance.tableBase}"/>

</form>
<svg width="400" height="400">
    <circle r="198" cx="200" cy="200"/>
    <g:each var="line" in="${circleInstance.lines}">
        <line
                x1="${line.x1}"
                y1="${line.y1}"
                x2="${line.x2}"
                y2="${line.y2}"/>
    </g:each>
</svg>

</body>
</html>
