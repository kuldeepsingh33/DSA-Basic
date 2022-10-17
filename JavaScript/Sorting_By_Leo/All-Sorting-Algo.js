// Helper functions :

function swap(arr, a, b) {
    let temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
}

const Compare = {
    LESS_THAN: -1,
    BIGGER_THAN: 1
};

function defaultCompare(a, b) {
    if (a === b) {
        return 0;
    }
    return a < b ? Compare.LESS_THAN : Compare.BIGGER_THAN;
}


// Basic Sorting Algorithms

function bubbleSort(arr, compare = defaultCompare) {
    const { length } = arr;
    for (let i = 0; i < length; i++) {
        for (let j = 0; j < length - 1 - i; j++) { // refer to note below
            if (compare(arr[j], arr[j + 1]) === Compare.BIGGER_THAN) {
                swap(arr, j, j + 1);
            }
        }
    }
    return arr;
}

function selectionSort(arr, compare = defaultCompare) {
    const { length } = arr;
    let minIndex;
    for (let i = 0; i < length - 1; i++) {
        minIndex = i;
        for (let j = i; j < length; j++) {
            if (compare(arr[minIndex], arr[j]) === Compare.BIGGER_THAN) {
                minIndex = j;
            }
        }
        if (i !== minIndex) {
            swap(arr, i, minIndex);
        }
    }
    return arr;
}


function insertionSort(arr, compare = defaultCompare) {
    const { length } = arr;
    let temp;
    for (let i = 1; i < length; i++) {
        let j = i;
        temp = arr[i];
        while (j > 0 && compare(arr[j - 1], temp) === Compare.BIGGER_THAN) {
            arr[j] = arr[j - 1];
            j--;
        }
        arr[j] = temp;
    }
    return arr;
}



function mergeSort(arr, compare = defaultCompare) {
    if (arr.length > 1) {
        const { length } = arr;
        const middle = Math.floor(length / 2);
        const left = mergeSort(arr.slice(0, middle), compare);
        const right = mergeSort(arr.slice(middle, length), compare);
        arr = merge(left, right, compare);
    }
    return arr;
}

function merge(left, right, compare) {
    let i = 0;
    let j = 0;
    const result = [];
    while (i < left.length && j < right.length) {
        result.push(compare(left[i], right[j]) === Compare.LESS_THAN ? left[i++] : right[j++]);
    }
    return result.concat(i < left.length ? left.slice(i) : right.slice(j));
}



function quickSort(arr, compare = defaultCompare) {
    return quick(arr, 0, arr.length - 1, compare);
}

function quick(arr, left, right, compare) {
    let i;
    if (arr.length > 1) {
        i = partition(arr, left, right, compare);
        if (left < i - 1) {
            quick(arr, left, i - 1, compare);
        }
        if (i < right) {
            quick(arr, i, right, compare);
        }
    }
    return arr;
}

function partition(arr, left, right, compare) {
    const pivot = arr[Math.floor((right, left) / 2)];
    let i = left;
    let j = right;

    while (i <= j) {
        while (compare(arr[i], pivot) === Compare.LESS_THAN) {
            i++;
        }
        while (compare(arr[j], pivot) === Compare.BIGGER_THAN) {
            j--;
        }
        if (i <= j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }
    return i;
}



function bucketSort(arr, bucketSize) {
    if (arr.length < 2) {
        return arr;
    }
    // create buckets and distribute the elements
    const buckets = createBuckets(arr, bucketSize);
    // sort the buckets using insertion sort and add all bucket elements to sorted result 
    return sortBuckets(buckets);
}

function createBuckets(arr, bucketSize) {
    // determine the bucket count
    let min = arr[0];
    let max = arr[0];
    for (let i = 1; i < arr.length; i++) {
        if (arr[i] < min) {
            min = arr[i];
        } else if (arr[i] > max) {
            max = arr[i];
        }
    }
    const bucketCount = Math.floor((max - min) / bucketSize) + 1;

    // initialize each bucket (a multidimensional array)
    const buckets = [];
    for (let i = 0; i < bucketCount; i++) {
        buckets[i] = [];
    }

    // distribute elements into buckets
    for (let i = 0; i < arr.length; i++) {
        const bucketIndex = Math.floor((arr[i] - min) / bucketSize);
        buckets[bucketIndex].push(arr[i]);
    }
    return buckets;
}

function sortBuckets(buckets) {
    const sortedArr = [];
    for (let i = 0; i < buckets.length; i++) {
        if (buckets[i] != null) {
            insertionSort(buckets[i]); // quick sort is another good option
            sortedArr.push(...buckets[i]);
        }
    }
    return sortedArr;
}


